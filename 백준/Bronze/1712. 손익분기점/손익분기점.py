a, b, c = map(int, input().split())
d = 0
if c <= b:
    d = -1
else :
    d  = (a/(c-b)) +1

print(int(d))