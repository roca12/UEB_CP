# Autor: Alejandra Carvajal
# Problema: A + B Again?
# Juez online: CodeForces
# Veredicto: Accepted
# URL: https://codeforces.com/problemset/problem/1999/A

t = int(input())

for _ in range (t):
    n = int(input())
    n1 = n // 10
    n2 = n % 10
    result = n1 + n2
    print(result)
    
