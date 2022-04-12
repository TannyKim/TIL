# 문제: https://www.acmicpc.net/problem/2798

import sys
from itertools import combinations

n, m = map(int, sys.stdin.readline().split())
cards = list(map(int, sys.stdin.readline().split()))

picks = list(combinations(cards, 3))

result = []

for i in picks:
    sumed = sum(i)
    if sumed <= m:
        result.append(sumed)

print(max(result))

    


    
