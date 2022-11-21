N = int(input())
reward = []
for i in range(N):
    a = list(map(int, input().split()))
    if a[0] == a[1] == a[2]:
        reward.append(10000 + a[0]*1000)
    elif a[0] == a[1]:
        reward.append(1000 + a[0]*100)
    elif a[1] == a[2]:
        reward.append(1000 + a[1]*100)
    elif a[0] == a[2]:
        reward.append(1000 + a[0]*100)
    else:
        reward.append(max(a)*100)

print(max(reward))