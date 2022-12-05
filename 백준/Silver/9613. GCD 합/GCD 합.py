import sys
input = sys.stdin.readline
def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)


n = int(input())

for i in range(n):
    sum = 0
    a = list(map(int, input().split()))
    for j in range(1, a[0]):
        for k in range(j + 1, a[0] + 1):
            sum += gcd(a[j], a[k])
    print(sum)
