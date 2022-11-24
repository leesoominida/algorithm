n = int(input())
li = []
row = col = 0
cnt = 0
for i in range(n):
    li.append(list(input()))
for i in range(n):
    cnt = 0
    for j in range(n):
        if li[i][j] =='.':
            cnt +=1
        else:
            cnt = 0
        if cnt == 2:
            row += 1
for i in range(n):
    cnt = 0
    for j in range(n):
        if li[j][i] == '.':
            cnt += 1
        else:
            cnt = 0
        if cnt ==2:
            col += 1
print(row, col)