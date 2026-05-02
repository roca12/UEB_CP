# Autor: David Santiago García Preciado
# Problema: The 67th OEIS Problem - 2218D
# Juez online: Codeforces
# Veredicto: Accepted
# URL: https://codeforces.com/problemset/problem/2218/D

def get_primes(limit):
    primes = []
    bruteforc = [True] * (limit + 1)
    bruteforc[0] = bruteforc[1] = False
    for i in range(2, limit + 1):
        if bruteforc[i]:
            primes.append(i)
            for j in range(i*i, limit + 1, i):
                bruteforc[j] = False
    return primes
primes = get_primes(200000)
import sys
input = sys.stdin.readline
t = int(input())
for _ in range(t):
    data = int(input())
    res = []
    if data == 1:
        res = [1]
    else:
        res.append(primes[0])
        for i in range(1, data):
            res.append(primes[i-1] * primes[i])
    print(*res)