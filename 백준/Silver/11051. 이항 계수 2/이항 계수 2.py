n, k = map(int, input().split())
result = 1

for i in range(k):
    result = result * (n-i) // (i+1)

print(result%10007)
