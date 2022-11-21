N = int(input())
vote = 0
for i in range(N):
    a = int(input())
    vote += a
if vote > N/2 :
    print("Junhee is cute!")
else:
    print("Junhee is not cute!")