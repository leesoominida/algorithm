n = int(input())
a = []
for i in range(n):
    a.append(input())
    
a = list(set(a)) #중복제거
a.sort()   #알파벳순정렬
a.sort(key=len) #길이순정렬

for i in a:
    print(i)