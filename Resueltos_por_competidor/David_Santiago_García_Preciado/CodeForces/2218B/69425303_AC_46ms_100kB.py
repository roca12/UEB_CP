# Autor: David Santiago García Preciado
# Problema: The 67th 6-7 Integer Problem - 2218B
# Juez online: Codeforces
# Veredicto: Accepted
# URL: https://codeforces.com/problemset/problem/2218/B

t = int(input())
for _ in range(t):
    data = list(map(int, input().split()))
    total = sum(data)
    maxi = max(data)
    print(2 * maxi - total)