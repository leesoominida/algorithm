s = input()
a = set()

for i in range(len(s)):
    for j in range(i, len(s)):
        tmp = s[i:j+1]
        a.add(tmp)
print(len(a))
    