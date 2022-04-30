## 정렬 조건, 다중 조건
```python

a = [(4,0), (4,3), (4,1), (3,2), (2,1), (1,1), (1,0)]

# 인자 없이 sorted() 사용하면 리스트 아이템의 각 요소 순서대로 정렬
# 첫 번째 요소가 같으면 두 번째 요소로 비교
result = sorted(a)
print(result)
>>[(1, 0), (1, 1), (2, 1), (3, 2), (4, 0), (4, 1), (4, 3)]

# lambda를 이용한 정렬
# 이 때, key로 전달되지 않은 요소에 대해서는 정렬하지 않음
result2 = sorted(a, key=lambda x: x[0])
print(result2)
>>[(1, 1), (1, 0), (2, 1), (3, 2), (4, 0), (4, 3), (4, 1)]


# (idx, age, name)
# 다중 조건을 넘겨 줄 수 있음
# 첫 번째 인자를 가지고 오름차순 정렬
# 두 번째 인자를 가지고 내림차순 정렬 (-를 붙이면 내림차순 정렬)
array = [(0, 21, 'tanny'), (1, 23, 'yuki'), (2, 23, 'lee'), (3, 26, 'mikey')]

# 나이순으로 오름차순 정렬 하되 인덱스 순으로 내림차 순 정렬
result3 = sorted(array, key = lambda x: (x[1], -x[0]))
print(result3)
>>> [(0, 21, 'tanny'), (2, 23, 'lee'), (1, 23, 'yuki'), (3, 26, 'mikey')]
```

## list.sort(key = len)
   * 이 경우 정렬하되 원소의 길이를 기준으로 정렬하게 된다.
   * 숫자는 오름차순 정렬(1, 2, 3 ...) / 문자는 사전순 및 영어, 한국어 순서로 정렬된다.
   ```python
   lst = [a, b, cc, ab]
   
   lst.sort()
   print(lst)
   
   >> [a, ab, b, cc] # 사전순 정렬
   
   lst.sort(key = len)
   print(lst)
   >> [a, b, ab, cc] # 이후 길이 순 정렬
   ```

## list.sort(revesre = True)
   * reverse = True 를 설정함으로써 역순(내림차순) 정렬이 가능하다.
   * 기본값은 revesr = False로 오름차순이다.
   ```python
   num_list = [15, 22, 8, 79, 10]
>>> num_list.sort(reverse=True)
>>> print(num_list)
[79, 22, 15, 10, 8]

>>> print(sorted(['좋은하루','good_morning','굿모닝','niceday'], reverse=True))
['좋은하루', '굿모닝', 'niceday', 'good_morning']
```

 
