n = int(input())
a = 2

while a<=n:
    if n%a == 0:
        print(a)
        n = n / a
    else:
        a += 1