import math
n = int(input())

def isPrime(x):
    if x == 1:
        return False
    for i in range(2, int(math.sqrt(x)+1)):
        if x%i == 0 :
            return False
    return True

def isPalindrome(x):
    s = str(x)
    reverse_s = s[::-1]
    if s == reverse_s:
        return True
    else:
        return False
while True:
    if isPrime(n) and isPalindrome(n):
        print(n)
        break
    else:
        n += 1