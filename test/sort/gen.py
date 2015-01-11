import random

n = 10**6
fin = open('in/5.in', 'w')
fout = open('out/5.in', 'w')

fin.write(str(n) + '\n')

a = [random.randrange(10**4) for _ in range(n)]

for i in a:
    fin.write(str(i) + '\n')

for i in sorted(a):
    fout.write(str(i) + '\n')

fin.close()
fout.close()

