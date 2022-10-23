n = int(input())
a = []

for i in range(n):
    a.append(list(map(int, input().split())))
    
b = sorted(a)

for i in range(n):
    print(b[i][0], b[i][1])