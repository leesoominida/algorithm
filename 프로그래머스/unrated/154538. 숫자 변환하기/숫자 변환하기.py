def solution(x, y, n):
    answer = 0
    
    dp = set()
    dp.add(x)
    
    while dp:
        if y in dp:
            return answer
        else:
            dp2 = set()
            for i in dp:
                if i + n <= y:
                    dp2.add(i+n)
                if i *2 <= y :
                    dp2.add(i*2)
                if i * 3 <= y:
                    dp2.add(i*3)
            dp = dp2
            answer += 1

    return -1