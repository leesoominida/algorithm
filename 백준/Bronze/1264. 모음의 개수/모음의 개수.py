while True:
    s = input().lower()
    if s == "#":
        break
    cnt = 0
    for i in s:
        if i in 'aeiou':
            cnt += 1
    print(cnt)