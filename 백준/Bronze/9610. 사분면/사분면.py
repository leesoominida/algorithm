N = int(input())
Q1 = 0
Q2 = 0
Q3 = 0
Q4 = 0
Axis = 0
for i in range(N):
    a, b = map(int, input().split())
    if a == 0 or b == 0:
        Axis += 1
    elif a > 0 and b > 0:
        Q1 += 1
    elif a > 0 and b < 0:
        Q4 += 1
    elif a < 0 and b > 0:
        Q2 += 1
    elif a < 0 and b < 0:
        Q3 += 1
print("Q1: " + str(Q1))
print("Q2: " + str(Q2))
print("Q3: " + str(Q3))
print("Q4: " + str(Q4))
print("AXIS: " + str(Axis))

