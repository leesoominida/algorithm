import sys
input = sys.stdin.readline
n = int(input())

a = []
for i in range(n):
    m = int(input())
    a.append(m)

a.sort(reverse=True)
for i in a:
    print(i)