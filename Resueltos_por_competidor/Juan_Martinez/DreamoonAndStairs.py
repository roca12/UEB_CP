'''
 * Autor: Juan Martinez
 * Problema: Dreamoon and Stairs (476A)
 * Juez online: Codeforces
 * Veredicto: Accepted
 * Url: https://codeforces.com/problemset/problem/476/A
 * Difficulty: 1000
'''
a, b = map(int, input().split())

b1 = 0
z = -1
for i in range(((a + 1)//2),a,1):
    if i % b == 0:
        b1 = 1
        z = i
        break
if b1: print(z)
elif a == b: print(b)
else: print(-1)
