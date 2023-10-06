def solution(myString):
    answer = []   
    a = myString.split("x")
    for s in a:
        answer.append(len(s))
    return answer