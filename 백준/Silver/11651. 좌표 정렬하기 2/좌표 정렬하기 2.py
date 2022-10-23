n = int(input())
a = []

for i in range(n):
    [x, y] = map(int, input().split())
    reverse =  [y, x]
    a.append(reverse)
    
b = sorted(a)
for i in range(n):
    print(b[i][1], b[i][0])