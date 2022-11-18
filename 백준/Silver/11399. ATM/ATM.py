n = int(input())
minute = list(map(int, input().split(' ')))
all = 0
minute.sort()

for i in range(n):
    for j in range(i+1):
        all += minute[j]
print(all)