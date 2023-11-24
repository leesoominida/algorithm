def solution(x):
 
    return x % sum([int(a) for a in str(x)]) == 0