s = input()
t = input()

s_len = len(s)
t_len = len(t)

if s*t_len == t*s_len:
    print(1)
else:
    print(0)