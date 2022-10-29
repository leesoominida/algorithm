n = int(input())
a = list(map(int, input().split()))
m = int(input())
b = list(map(int, input().split())) 

dic = {i : 0 for i in a}
for j in b:
    if j in dic:
        print(1, end=" ")
    else:
        print(0, end=" ")