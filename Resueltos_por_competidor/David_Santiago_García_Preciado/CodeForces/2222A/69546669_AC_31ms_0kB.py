# Autor: David Santiago García Preciado
# Problema: A Wonderful Contest - 2222A
# Juez online: Codeforces
# Veredicto: Accepted
# URL: https://codeforces.com/problemset/problem/2222/A

cases = int(input())
for _ in range(cases):
    n = int(input())
    data = list(map(int, input().split()))
    if(100 in data):
        print("Yes")
    else:
        print("No")