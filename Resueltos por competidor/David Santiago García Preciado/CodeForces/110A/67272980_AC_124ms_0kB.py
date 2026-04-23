n = input()

count_lucky = sum(1 for c in n if c in "47")

if str(count_lucky) in "47":
    print("YES")
else:
    print("NO")
