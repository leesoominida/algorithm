n, m = map(int, input().split())

a = set(map(int, input().split()))
b = set(map(int, input().split()))
       
ab = set(a-b)
ba = set(b-a)

print(len(ab) + len(ba))