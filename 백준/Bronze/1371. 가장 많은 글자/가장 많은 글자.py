import sys
alp = [0]*26

s = sys.stdin.read().replace('\n', '').replace(' ','')

for i in s:
    alp[ord(i)-97] += 1

for j in range(26):
    if alp[j] == max(alp):
        print(chr(97+j), end ='')
