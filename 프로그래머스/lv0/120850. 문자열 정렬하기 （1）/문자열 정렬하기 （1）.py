def solution(my_string):
    answer = []
    
    answer = sorted([int(i) for i in str(my_string) if i.isdigit()])
    
    return answer