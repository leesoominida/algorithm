n = int(input())
n_cards = list(map(int, input().split()))
m = int(input())
num = list(map(int, input().split()))

n_cards.sort()
cardsDic = {}

for i in n_cards:
    if i in cardsDic:
        cardsDic[i] += 1
    else:
        cardsDic[i] = 1
        

for i in num:
    if i in cardsDic:
        print(cardsDic[i], end = " ")
    else:
        print(0, end=" ")