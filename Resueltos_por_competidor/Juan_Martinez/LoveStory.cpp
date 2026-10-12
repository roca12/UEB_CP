/*
 * Autor: Juan Martinez
 * Problema: Love Story (1829A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/1829/A
 * Difficulty: 800
 */
t = int(input())
c = 'codeforces'
for i in range(t):
    s = input()
    res = 0
    for j in range(10):
        if s[j] != c[j]:
            res += 1
    print(res)
    
