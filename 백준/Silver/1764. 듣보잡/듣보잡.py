n, m = map(int, input().split())

listen = set()
for i in range(n):
    listen.add(input())
    
seek = set()
for i in range(m):
    seek.add(input())
    
listen_seek = sorted(list(listen&seek))

print(len(listen_seek))
for i in listen_seek:
    print(i)