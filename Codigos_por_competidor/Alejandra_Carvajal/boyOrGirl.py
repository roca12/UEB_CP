# Autor: Alejandra Carvajal
# Problema: 236A - Boy or Girl
# Juez online: Codeforces
# Veredicto: Runtime error on test 1
# URL: https://codeforces.com/problemset/problem/236/A
t = int(input())
for i in range(1,t+1):
    user = input()
    
    u = set(user)
    c = len(u)
    
    if c % 2 == 0:
        print("CHAT WITH HER!")
    else:
        print("IGNORE HIM!")
