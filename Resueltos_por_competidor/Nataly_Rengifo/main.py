#Autor: natar2005
#Problema: A Number Between Two Others
#Juez online: Codeforces
#Veredicto: Accepted
#URL:https://codeforces.com/problemset/problem/2225/A
t = int(input())
for _ in range(t):
    x, y = map(int, input().split())
    k = y // x

    if k == 2:
        print("NO")
    else:
        z = x * (k - 1)
        print("YES")