import sys
input = sys.stdin.readline

n, m = map(int, input().split())
a = list(map(int, input().split()))

pre = [0]
sum = 0

for i in range(n):
    sum += a[i]
    pre.append(sum)

for i in range(m):
    a, b = map(int, input().split())
    print(pre[b] - pre[a-1])