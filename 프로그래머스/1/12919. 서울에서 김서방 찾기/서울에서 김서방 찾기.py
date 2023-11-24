def solution(seoul):
    answer = ''
    
    for a in range(len(seoul)):
        if seoul[a] == 'Kim':
            answer = "김서방은 " + str(a) + "에 있다"
    return answer