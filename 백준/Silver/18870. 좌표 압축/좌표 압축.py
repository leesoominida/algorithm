n = int(input())

a = list(map(int, input().split()))
b = {}
a_sorted = sorted(set(a))

for i in range(len(a_sorted)):
    b[a_sorted[i]] = i
    
for j in a:
    print(b[j], end=' ')