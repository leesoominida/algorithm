a = []
for i in range(8):
    a.append(int(input()))

a_sort = sorted(a, reverse=True)

idx = []
for i in a_sort[:5]:
    idx.append(a.index(i)+1)

print(sum(a_sort[:5]))
idx.sort()
print(*idx)