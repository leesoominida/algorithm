def solution(a, b):
    answer = 0
    
    if int(str(a)+str(b)) >=2*a*b:
        return int(str(a) + str(b))

    else:
        return a*b*2
