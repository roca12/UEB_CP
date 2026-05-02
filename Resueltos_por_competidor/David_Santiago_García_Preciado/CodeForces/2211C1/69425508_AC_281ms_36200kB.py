# Autor: David Santiago García Preciado
# Problema: Equal Multisets (Easy Version) - 2211C1
# Juez online: Codeforces
# Veredicto: Accepted
# URL: https://codeforces.com/problemset/problem/2211/C1

import sys
from collections import Counter
 
input = sys.stdin.readline
 
t = int(input())
for _ in range(t):
    n, k = map(int, input().split())
    a = list(map(int, input().split()))
    b = list(map(int, input().split()))
    free_start = n - k
    free_end   = k - 1
 
    ok = True
 
    for i in range(n):
        if free_start <= i <= free_end:
            continue
        if b[i] != -1 and b[i] != a[i]:
            ok = False
            break
 
    if ok and free_start <= free_end:
        required = Counter(a[free_start : free_end + 1])
        for i in range(free_start, free_end + 1):
            if b[i] != -1:
                if required[b[i]] == 0:
                    ok = False
                    break
                required[b[i]] -= 1
 
    print("YES" if ok else "NO")