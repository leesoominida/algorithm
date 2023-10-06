def solution(todo_list, finished):
    answer = []

    for a in range(len(finished)):
        if finished[a] is False:
            print(todo_list[a])
            answer.append(todo_list[a])
            
    
    return answer