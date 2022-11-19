import sys
input = sys.stdin.readline

n, k = map(int, input().split())
a = [*map(int, input().split())]

result = sum(a[:k])
answer = result

for i in range(k, n):
    result = result + a[i] - a[i-k]
    answer = max(result, answer)

print(answer)