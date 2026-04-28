"""""
Autor: Scioville
Problema: Simple Sequence (https://codeforces.com/contest/2210/problem/A)
Juez online: Codeforce
Veredicto: accepted
Hey,do you like bavarois?
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