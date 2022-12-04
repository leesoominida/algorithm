a = int(input())

while True:
    opp = input()
    if opp == "=":
        break
    n = int(input())
    if opp == "+":
        a += n
    elif opp == "-":
        a -= n
    elif opp == "*":
        a *= n
    else:
        a //= n

print(a)
