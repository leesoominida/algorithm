import sys
input = sys.stdin.readline
n = int(input())

a = [int(input()) for _ in range(n)]
if a[1]-a[0] == a[2]-a[1]:
    print(a[n-1]+a[1]-a[0])
else:
    print(a[n-1]*(a[1]//a[0]))