n = 10**5
fin = open('in/5.in', 'w')
fout = open('out/5.out', 'w')

fin.write(str(n) + '\n')

a = {i: True for i in range(2, n)}

for k, v in a.items():
    if v:
        i = 2
        while k*i < n:
            a[k*i] = False
            i += 1


for k, _ in filter(lambda x: x[1], a.items()):
    fout.write(str(k) + '\n')

fin.close()
fout.close()

