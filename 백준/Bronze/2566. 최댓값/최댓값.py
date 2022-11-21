import sys

max_num = -1

for i in range(9):
    a = list(map(int, sys.stdin.readline().split()))
    if max(a) > max_num:
        max_num = max(a)
        x = i + 1
        y = a.index(max_num) + 1

print(max_num)
print(x, y)
