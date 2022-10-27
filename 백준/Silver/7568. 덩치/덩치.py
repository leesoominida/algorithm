n = int(input())
m = []

for i in range(n):
    a, b = map(int, input().split())
    m.append((a,b))
    
for i in m:
    c = 1
    for j in m:
        if i[0] < j[0] and i[1] < j[1]:
            c += 1
    print(c, end = " ")