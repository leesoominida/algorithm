a = input().lower()
a_list = list(set(a))
cnt_list = []

for i in a_list:
    cnt = a.count(i)
    cnt_list.append(cnt)
    
if cnt_list.count(max(cnt_list))>=2 :
    print("?")
else :
    print(a_list[(cnt_list.index(max(cnt_list)))].upper())