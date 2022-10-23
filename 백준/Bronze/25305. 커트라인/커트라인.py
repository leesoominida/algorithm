a, b = map(int, input().split())
scores = list(map(int, input().split()))

scores.sort(reverse=True)

print(scores[b-1])