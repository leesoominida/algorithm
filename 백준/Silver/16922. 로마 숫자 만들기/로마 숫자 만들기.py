from itertools import combinations_with_replacement
n = int(input())
result = set()
nums = [1, 5, 10, 50]

for i in combinations_with_replacement(nums, n):
    result.add(sum(i))
print(len(result))