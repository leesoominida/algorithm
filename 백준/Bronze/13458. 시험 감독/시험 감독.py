n = int(input())
A = list(map(int, input().split()))
B, C = map(int, input().split())
result = 0

for i in A:
    cnt = 1
    i -= B
    if i > 0:
        cnt += i//C
        if i % C != 0:
            cnt +=1
    result += cnt
    
print(result)