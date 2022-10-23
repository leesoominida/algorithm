n = int(input())

for i in range(n):
    a = list(map(str, input()))
    score = 0
    count = 1
    for i in a:
        if i == 'O':
            score += count
            count += 1
        else:
            count = 1
        
    print(score)