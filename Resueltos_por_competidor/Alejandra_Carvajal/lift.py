# Autor: Alejandra Carvajal
# Problema: Lift
# Juez online: LightOJ
# Veredicto: Accepted
# URL: https://lightoj.com/problem/lift

import math
t = int(input())

for i in range(1, t+1):
    p, a = map(int, input().split())
    
    puerta = 3
    entrada_salida = 5
    
    f = abs(a - p) * 4
    ground_floor = p * 4
    
    tiempo = (puerta * 2) + (entrada_salida * 2) + f + ground_floor + puerta
    
    print(f"Case {i}: {tiempo}")
    
