t = int(input())
for _ in range(t):
    user = input()
    
    u = set(user)
    c = len(u)
    
    if c % 2 == 0:
        print("CHAT WITH HER!")
    else:
        print("IGNORE HIM!")
    
