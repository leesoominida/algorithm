s = input()
ans = 0
for i in range(len(s)//2):
    if s[i] == s[-1-i]:
        ans += 1
    else:
        ans += 0

if ans == len(s)//2:
    print(1)
else:
    print(0)