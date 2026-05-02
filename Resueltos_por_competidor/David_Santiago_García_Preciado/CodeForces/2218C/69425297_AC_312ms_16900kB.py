# Autor: David Santiago García Preciado
# Problema: The 67th Permutation Problem - 2218C
# Juez online: Codeforces
# Veredicto: Accepted
# URL: https://codeforces.com/problemset/problem/2218/C

t = int(input())
for _ in range(t):
    data = int(input())
    res = []
    l = 1
    r = 3*data
    for _ in range(data):
        res.append(l)
        res.append(r-1)
        res.append(r)
        l += 1
        r -= 2
    print(*res)