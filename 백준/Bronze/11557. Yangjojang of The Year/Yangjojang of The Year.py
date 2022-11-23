T = int(input())

for _ in range(T):
    N = int(input())
    arr = []

    for i in range(N):
        a, b = map(str, input().split())
        arr.append([a, int(b)])

    arr = sorted(arr, key=lambda x: x[1])
    print(arr[-1][0])
