import random, sys
n = 1000000 - 1
m = 1000000 - 1
sys.setrecursionlimit(m)

fin = open('in/5.in', 'w')
fout = open('out/5.out', 'w')

fin.write('%d %d\n' % (n, m))

edges = set()


def rand_edge():
    while True:
        a, b = random.randrange(n), random.randrange(n)
        if a == b:
            continue
        e = (a, b)
        if e not in edges:
            edges.add(e)
            return e


for _ in range(m):
    rand_edge()

for a, b in edges:
    fin.write('%d %d\n' % (a, b))

fin.close()

g = [[] for _ in range(n)]
for a, b in edges:
    g[a].append(b)
    g[b].append(a)

visited = [False]*n


def dfs(v):
    if visited[v]:
        return
    visited[v] = True
    for i in g[v]:
        dfs(i)

dfs(0)
fout.write('%s\n' % 'ANO' if all(visited) else 'NIE')

fout.close()
