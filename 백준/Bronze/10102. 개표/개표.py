V = int(input())
a = list(input())
A = 0
B = 0
for i in range(V):
    if a[i] == 'A':
        A += 1
    else:
        B += 1

if A == B:
    print("Tie")
elif A < B:
    print("B")
elif A > B:
    print("A")
