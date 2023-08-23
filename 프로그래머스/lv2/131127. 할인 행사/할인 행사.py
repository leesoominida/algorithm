from collections import Counter

def solution(want, number, discount):
    answer = 0
    dic = {}

    for i in range(len(want)):
        dic[want[i]] = number[i]

    for i in range(len(discount) - 9):
        dic_temp = dic.copy()
        for j in range(i, i+10):
            if discount[j] in dic_temp and dic_temp[discount[j]] != 0:
                dic_temp[discount[j]] -= 1
            else:
                break
                                                             
        if sum(dic_temp.values()) == 0:
            answer += 1
    return answer