# Autor: Alejandra Carvajal
# Problema: Subscriptions
# Juez online: CodeChef
# Veredicto: Accepted
# URL: https://www.codechef.com/problems/SUBSCRIBE_

import math

t = int(input())

for _ in range(t):
    n, x = map(int, input().split())
    
    grupo_de_seis = math.ceil(n / 6)
    precio_final = x * grupo_de_seis
    
    print(precio_final)
