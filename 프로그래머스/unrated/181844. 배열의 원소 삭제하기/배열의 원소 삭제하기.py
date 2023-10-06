def solution(arr, delete_list):
    answer = list(filter(lambda x : x not in delete_list, arr))
  
    return answer