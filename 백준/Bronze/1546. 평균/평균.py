n = int(input())
a = list(map(int, input().split()))
max_score = max(a)

for i in range(n):
    a[i] = a[i]/max_score*100
    
avg_score = sum(a)/n
print(avg_score)