a = input()
answer = 10
for i in range(len(a)-1):
    if a[i] == a[i+1]:
        answer += 5
    else:
        answer += 10

print(answer)