n =int(input())

for i in range(n):
    a = input()
    for i in range(0, len(a)-1):
        if (a[i] != a[i+1] and a[i] in a[i+1:]):
            n = n-1
            break
            
print(n)