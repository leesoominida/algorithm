list = []

for i in range(10):
    a = int(input())
    b = a%42
    list.append(b)
    
set = set(list)
print(len(set))