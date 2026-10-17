/*
 * Autor: Juan Martinez
 * Problema: Uncle Jack
 * Juez online: Vjudge
 * Veredicto: Accepted
 * Url: https://vjudge.net/problem/SPOJ-UJ
 */
while(True):
    a, b = map(int, input().split())
    if a == 0 and b == 0: break
    c = pow(a,b)
    print(c)
