def isPrime(num):
    if num==1:
        return False
    else:
        for i in range(2, int(num**0.5)+1):
            if num%i == 0:
                return False
        return True
    
a = []

for i in range(2, 123456*2 +1):
    if isPrime(i):
        a.append(i)
        
while 1:
    n = int(input())
    
    if n == 0:
        break
    cnt = 0
    for i in a:
        if i > 2*n:
            break
        elif n < i <= 2*n:
            cnt+=1
    print(cnt)