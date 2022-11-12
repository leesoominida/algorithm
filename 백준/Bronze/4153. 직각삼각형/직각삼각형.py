while True:
    tri = list(map(int, input().split()))
    if tri[0] == 0 and tri[1] ==0 and tri[2] == 0:
        break
    max_tri = max(tri)
    tri.remove(max_tri)
    if max_tri**2 == tri[0]**2 + tri[1]**2:
        print('right')
    else:
        print('wrong')