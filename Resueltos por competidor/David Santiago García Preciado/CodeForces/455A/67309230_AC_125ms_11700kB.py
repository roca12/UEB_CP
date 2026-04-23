n = int(input())
arr = list(map(int, input().split()))

MAX = 100000
cnt = [0] * (MAX + 1)

for x in arr:
    cnt[x] += 1

dp = [0] * (MAX + 1)
dp[1] = cnt[1] * 1

for i in range(2, MAX + 1):
    dp[i] = max(dp[i - 1], dp[i - 2] + cnt[i] * i)

print(dp[MAX])
