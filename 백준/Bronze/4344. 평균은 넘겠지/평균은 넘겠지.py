n = int(input())

for i in range(n):
    a = list(map(int, input().split()))
    avg = sum(a[1:])/a[0]
    cnt = 0
    for j in range(1, len(a)):
        if a[j] > avg:
            cnt += 1        
    percent = 100 * cnt/a[0]
    print("{:.3f}%".format(round(percent, 3)))
    