T = int(input())

for i in range(T):
    Yon = Kor = 0
    for j in range(9):
        a, b = map(int, input().split())
        Yon += a
        Kor += b
    if Yon > Kor:
        print("Yonsei")
    elif Kor > Yon:
        print("Korea")
    else:
        print("Draw")
