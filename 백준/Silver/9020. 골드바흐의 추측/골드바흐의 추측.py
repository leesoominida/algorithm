def isPrime(num):
    if num==1:
        return False
    else:
        for i in range(2, int(num**0.5)+1):
            if num%i == 0:
                return False
        return True
    
num = int(input())
for i in range(num):
    a  = []
    n = int(input())
    
    for j in range(n//2, 0, -1):
        if isPrime(j) and isPrime(n-j):
            print(j, n-j)
            break