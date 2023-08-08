import heapq

def solution(scoville, K):
    heap = []
    for i in scoville:
        heapq.heappush(heap, i)
    
    answer = 0
    
    while heap[0] < K:
        heapq.heappush(heap, heapq.heappop(heap) + heapq.heappop(heap)*2)
        answer += 1
        
        if len(heap) ==1 and heap[0] < K :
            return -1
    return answer