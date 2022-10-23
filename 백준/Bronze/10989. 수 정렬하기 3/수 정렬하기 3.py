import sys
n = int(sys.stdin.readline())
num = [0]*10001

for i in range(n): 
    m = int(sys.stdin.readline())
    num[m] += 1

for j in range(10001):
    if num[j] !=0:
        for k in range(num[j]):
            print(j)