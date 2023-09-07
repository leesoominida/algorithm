def solution(myString, pat):    
    myString2 = "".join(["B" if c == "A" else "A" for c in myString])
    
    return 1 if pat in myString2 else 0