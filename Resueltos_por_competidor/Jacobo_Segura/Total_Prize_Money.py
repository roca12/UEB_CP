t = int(input())
while(t > 0):
    x, y = map(int, input().split())
    x = x*10
    y = y*90
    x = x+y
    print(x)
    t-=1
