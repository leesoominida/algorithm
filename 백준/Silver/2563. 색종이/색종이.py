n = int(input())

arr = [[0] * 100 for _ in range(100)]

for _ in range(n):
    a, b = map(int, input().split())
    for i in range(a, a+10):
        for j in range(b, b+10):
            arr[i][j] = 1

answer = 0
for i in arr:
    answer += i.count(1)
print(answer)