# 문제: https://www.acmicpc.net/problem/2798

import sys
from itertools import combinations

n, m = map(int, sys.stdin.readline().split())
cards = list(map(int, sys.stdin.readline().split()))

picks = list(combinations(cards, 3))

sums = []

for i in picks:
    sums.append(sum(i))

sums.sort()
result = []

for j in sums:
    if j <= m:
        result.append(j)

print(result[-1])

    
