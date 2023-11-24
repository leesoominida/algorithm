def solution(n):
    answer = 0
    
    l = list(str(int(n)))
    l.sort(reverse=True)
    answer = int("".join(l))
    
    return answer