def gcd(a,b):
    while b > 0:
        a, b = b, a % b
    return a


n = int(input())

for i in range(n):
    a, b = map(int, input().split())
    n = a*b//gcd(a,b)
    print(n)