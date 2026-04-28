"""""
Autor: Scioville
Problema: Simply Sitting on Chairs (https://codeforces.com/contest/2210/problem/B)
Juez online: Codeforce
Veredicto: accepted
I don't think you two can be happy together, because I will always love you. Eternally...
"""
t = int(input())
lista = []
for i in range(t):
    lista.clear()
    s = int(input())
 
    lista.append(2)
    if s > 2:
        for _ in range(s):
            if s-_>=3 :
                lista.append(s-_)
 
    lista.append(1)
    print(*lista)