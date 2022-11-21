N = int(input())
cnt = 0
sum = 0
while True:
    cnt += 1
    sum += cnt
    if sum > N:
        break
print(cnt-1)