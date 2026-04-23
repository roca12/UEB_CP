n = int(input())
boys = list(map(int, input().split()))

m = int(input())
girls = list(map(int, input().split()))

boys.sort()
girls.sort()

i = j = 0
pairs = 0

while i < n and j < m:
    if abs(boys[i] - girls[j]) <= 1:
        pairs += 1
        i += 1
        j += 1
    elif boys[i] < girls[j]:
        i += 1
    else:
        j += 1

print(pairs)
