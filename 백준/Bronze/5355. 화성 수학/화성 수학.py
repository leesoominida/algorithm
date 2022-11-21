T = int(input())
for i in range(T):
    a = list(map(str, input().split()))
    for j in range(len(a)):
        if j == 0:
            answer = float(a[j])
        if a[j] == "@":
            answer *= 3
        elif a[j] == "%":
            answer += 5
        elif a[j] == "#":
            answer -= 7
    print("%0.2f" % answer)