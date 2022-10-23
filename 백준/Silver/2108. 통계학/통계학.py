import sys
from collections import Counter

n = int(sys.stdin.readline())
a = []
for i in range(n):
    a.append(int(sys.stdin.readline()))
    
b = sorted(a)
print(round(sum(a)/n))
print(b[n//2])

c = Counter(b).most_common()
if len(c) > 1 : 
    if c[0][1] == c[1][1]:
        print(c[1][0])
    else:
        print(c[0][0])
else :
    print(c[0][0])    

print(b[n-1]-b[0])