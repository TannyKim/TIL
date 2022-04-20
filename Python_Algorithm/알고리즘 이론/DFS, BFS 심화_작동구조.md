## 예제를 통해 의 작동 구조를 살펴봅시다.
 * 문제: https://www.acmicpc.net/problem/2667
 * 제출 코드
 ```python
 def dfs(x, y):
    if x <= -1 or x >= n or y <= -1 or y >= n:
        return False
    if graph[x][y] == 1:
        global count
        count += 1
        graph[x][y] = 0
        dfs(x - 1, y)
        dfs(x, y - 1)
        dfs(x + 1, y)
        dfs(x, y + 1)
        return True
    return False
   
n = int(input())
graph = []

for _ in range(n):
    graph.append(list(map(int, input())))

result = 0
count = 0
num = []

for i in range(n):
    for j in range(n):
        if dfs(i, j) == True:
            num.append(count)
            result += 1
            count = 0
num.sort()
print(result)
for i in num:
    print(i)

 ```
 
* 이해를 위해 프린트를 찍고 결과를 확인해봅시다.
```python
def dfs(x, y):
    if x <= -1 or x >= n or y <= -1 or y >= n:
        return False

    if graph[x][y] == 0:
        print(x, y, "pass")  # 값이 0 인 곳을 지나가는지 확인
    
    if graph[x][y] == 1:
        global count
        count += 1
        print(x, y, "count", count) # 값이 1인곳을 지날 때, count 변화 확인
        graph[x][y] = 0
        for t in graph:  # 값이 변한 이후 그래프의 상황 확인
            print(t)
        dfs(x - 1, y)
        dfs(x, y - 1)
        dfs(x + 1, y)
        dfs(x, y + 1)
        return True
    return print(x, y, "is end") # 함수를 끝내는 return -> 끝났는지 확인

n = int(input())
graph = []

for _ in range(n):
    graph.append(list(map(int, input())))

result = 0
count = 0
num = []

for i in range(n):
    for j in range(n):
        if dfs(i, j) == True:
            num.append(count)
            result += 1
            print("result", result) # True 카운팅 상황 체크
            print(i, j, "is True")  # 어느 시점(좌표)에서 True를 받았는지 확인
            count = 0
        else:
            print(i, j, "is False") # 그외 시점(좌표)는 제대로 False가 떨어지는지

num.sort()
print(result)
for i in num:
    print(i)

```
* 결과를 보고 해석
1. ![image](https://user-images.githubusercontent.com/98008421/164179496-8f0c08fb-5dd4-4a6c-a59a-76e2e9a6a3ca.png)
2. ![image](https://user-images.githubusercontent.com/98008421/164179810-e4cfb20d-77e1-4797-ac34-4562ed94a111.png)
3. ![image](https://user-images.githubusercontent.com/98008421/164179864-c64f84fe-2fd6-4db2-bbff-7ac9c99bc6b2.png)

- 이 처럼 return True와 return False 의 쓰임새를 파악할 수 있으며, 재귀적 작동 구조를 이해할 수 있다. 
- visited = [False] * (n + 1) 구조가 아니여도, 방문 상황을 체크 할 수 있다.

# 예제를 통해 BFS의 작동 구조를 파악해보자 (위와 같은 문제)
 * 제출 코드
```python



```
