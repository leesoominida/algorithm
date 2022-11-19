n = int(input())
a = list(map(int, input().split()))

def gcd(a, b):
    while b>0:
        a, b = b, a%b
    return a

target = a[0]

for i in range(1, n):
    num = gcd(target, a[i])

    print('{}/{}'.format(target//num, a[i]//num))