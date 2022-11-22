while True:
    a = int(input())
    if a == -1:
        break
    arr = []
    for i in range(1, a):
        if a % i == 0:
            arr.append(i)
    if sum(arr) == a:
        print(a, "=", " + ".join(str(i) for i in arr), sep=" ")

    else:
        print(a, "is NOT perfect.")
