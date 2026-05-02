# Autor: Alejandra Carvajal
# Problema: 1742A - Sum
# Juez online: Codeforces
# Veredicto: Accepted
# URL: https://codeforces.com/problemset/problem/1742/A

t = int(input())

for _ in range (t):
    a, b, c = map(int, input().split())
    
    if a == b + c:
        print("YES")
    elif b == a + c:
        print("YES")
    elif c == a + b:
        print("YES")
    else:
        print("NO")
            
    
