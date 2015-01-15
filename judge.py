#!/usr/bin/env python

import sys
import re
import os
import sh
import argparse
from collections import defaultdict


BIG_FILE = '5.in'
TEST_BIG = False


class cd:
    """Context manager for changing the current working directory"""
    def __init__(self, newPath):
        self.newPath = newPath

    def __enter__(self):
        self.savedPath = os.getcwd()
        os.chdir(self.newPath)

    def __exit__(self, etype, value, traceback):
        os.chdir(self.savedPath)


def run_script(project, script, *args, **kwargs):
    with cd(project):
        if '_in' in kwargs or '_out' in kwargs:
            try:
                return sh.Command(script)(*args, **kwargs)
            except sh.ErrorReturnCode as e:
                print(e)
        else:
            return os.system(script)


def load_programs(project):
    r = dict()
    with open(project + '/inputs.in') as f:
        for line in f:
            pair = re.split("[ \t]+", line.strip())
            if len(pair) != 2:
                continue
            r[pair[0]] = pair[1]
    return r


if __name__ == '__main__':
    args_p = argparse.ArgumentParser('Testovac kompilatorov')
    args_p.add_argument('project', default='c++', nargs='?',
                        help='Ktory projekt otestovat.')
    args_p.add_argument('programs', type=str, nargs='*',
                        help='Ktore programy spustit.',
                        default=['primes', 'sort', 'graph'])
    args = args_p.parse_args()
    project = args.project
    programs = args.programs
    if len(sys.argv) >= 2:
        project = sys.argv[1]
        if len(sys.argv) > 2:
            programs = sys.argv[2:]
    files = load_programs(project)
    ret = run_script(project, './build.sh')
    if ret != 0:
        print("build ends with non-zero status")
    prog_stat = defaultdict(lambda: defaultdict(int))
    prog_bad = defaultdict(list)
    for program in programs:
        # compile program
        binary = str(sh.tempfile()).strip()
        ret = run_script(project, './compile.sh ' + files[program] + ' ' + binary)
        if ret != 0:
            print("Unable to compile!")
        # get testsi

        path = 'test/' + program + '/in'
        tests = [
            f.strip()
            for f in filter(lambda x: TEST_BIG or x != BIG_FILE, os.listdir(path))
            if os.path.isfile(os.path.join(path, f))
        ]
        # run tests
        tempfile = sh.tempfile().strip()
        for test in tests:
            run_script(
                project,
                './run.sh',
                binary,
                _in=open('./test/{program}/in/{test}'.format(
                    program=program,
                    test=test,
                )),
                _out=tempfile,
            )
            out_correct = './test/{program}/out/{test}'.format(
                program=program,
                test=test,
            )
            same = True
            try:
                ret = sh.diff(tempfile, out_correct, _ok_code=range(0, 3))
                if ret.exit_code >= 1:
                    print('Tvoj program dal zly vysledok v ulohe {} '
                          'na priklade {}:\n{}'.format(program, test, ret))
                    same = False
                    prog_bad[program].append(test)
            except sh.ErrorReturnCode as e:
                print('UGH: toto by sa nemalo stat.')
                print(e)
                exit(1)
            prog_stat[program][same] += 1
    for program in programs:
        print('Program {}: {}/{}, chybne vysledky na vstupoch: {}'.format(
            program,
            prog_stat[program][True],
            prog_stat[program][True] + prog_stat[program][False],
            prog_bad[program],
        ))
