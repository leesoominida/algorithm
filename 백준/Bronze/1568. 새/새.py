n = int(input())
ans = 0

k = 1
while n > 0:
    if n < k:
        k = 1
    n -= k
    k += 1
    ans += 1

print(ans)