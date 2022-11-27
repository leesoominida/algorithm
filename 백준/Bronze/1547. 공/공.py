m = int(input())
cup = [0, 1, 2, 3]
for i in range(m):
    a, b = map(int, input().split())
    cup[a], cup[b] = cup[b], cup[a]

print(cup.index(1))