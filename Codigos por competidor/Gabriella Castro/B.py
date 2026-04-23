def dfs(n):
    visitado[n] = True
    for v in grafo[n]:
        if not visitado[v]:
            dfs(v)

n, m = map(int, input().split())
grafo = [[] for _ in range(n + 1)]
visitado = [False] * (n + 1)

for _ in range(m):
    a, b = map(int, input().split())
    grafo[a].append(b)
    grafo[b].append(a)

comp = 0
for i in range(1, n + 1):
    if not visitado[i]:
        comp += 1
        dfs(i)

if comp == 1:
    if m == n - 1:
        print("BOM")
    else:
        print("RUIM", m - (n - 1), 0)
else:
    print("RUIM", m - (n - comp), comp - 1)
