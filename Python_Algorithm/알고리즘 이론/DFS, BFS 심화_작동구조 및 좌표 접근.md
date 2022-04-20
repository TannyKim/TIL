## 예제를 통해 DFS의 작동 구조를 살펴봅시다.
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

## 예제를 통해 BFS의 작동 구조를 파악해보자 (위와 같은 문제)
 * 파이썬 코드
 * 출처: https://hongcoding.tistory.com/71
 * 원본 코드
```python
from collections import deque

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]


def bfs(graph, a, b):
    n = len(graph)
    queue = deque()
    queue.append((a, b))
    graph[a][b] = 0
    count = 1

    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue
            if graph[nx][ny] == 1:
                graph[nx][ny] = 0
                queue.append((nx, ny))
                count += 1
    return count

n = int(input())
graph = []
for i in range(n):
    graph.append(list(map(int, input())))

cnt = []
for i in range(n):
    for j in range(n):
        if graph[i][j] == 1:
            cnt.append(bfs(graph, i, j))

cnt.sort()
print(len(cnt))
for i in range(len(cnt)):
    print(cnt[i])
```
* 이해를 위해 print를 찍어봅시다.
```python
from collections import deque

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]


def bfs(graph, a, b):
    n = len(graph)
    queue = deque()
    queue.append((a, b))
    graph[a][b] = 0
    count = 1
    print(a, b, "에서 1이므로", count, "count")
    for t in graph:
        print(t)

    while queue:
        print("현재 큐는", queue) # 매 시행마다 queue를 확인
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            print("다음 좌표는", nx, ny) # 좌표의 변화를 확인
            if nx < 0 or nx >= n or ny < 0 or ny >= n:
                continue
            if graph[nx][ny] == 1:
                graph[nx][ny] = 0
                for t in graph:
                    print(t)  # 그래프의 변화를 확인
                queue.append((nx, ny))
                count += 1
                print(count, "count")
    return count


n = int(input())
graph = []
for i in range(n):
    graph.append(list(map(int, input())))

cnt = []
for i in range(n):
    for j in range(n):
        if graph[i][j] == 1:
            cnt.append(bfs(graph, i, j))
            print(cnt) # 1 값을 지나갈때 cnt의 상황을 확인
        else:
            print(i, j, "는 0이므로 pass") # 0 값이 pass 되는 순간을 확인

cnt.sort()
print(len(cnt))
for i in range(len(cnt)):
    print(cnt[i])
```
* 결과를 보고 해석
1. ![image](https://user-images.githubusercontent.com/98008421/164188821-b3b49ec0-230a-4581-a1f6-8b26a5c6e9a2.png)
2. ![image](https://user-images.githubusercontent.com/98008421/164189906-6f5496d1-86e5-4f0e-8cd1-31cfb479c057.png)
3. ![image](https://user-images.githubusercontent.com/98008421/164190055-c5355566-ef25-4158-b0b7-794d4ae32c9d.png)
- 이 처럼 while의 쓰임새를 파악할 수 있다.

## 좌표에 접근하는 방식
  * 같은 문제에서 좌표에 접근하는 방식이 각각 달랐다.
  * dfs에서는 재귀 함수를 이용할때 변수 값의 좌표를 각각 지정하였다
  * bfs는 좌표 array를 만들어서 하나씩 대입하였다.
  * 그러나 이러한 좌표 접근 방식은 dfs와 bfs를 구분하지 않고 사용될 수 있다!
  - dfs에서 좌표 array를 이용하여 좌표 접근
  - 출처: https://hongcoding.tistory.com/71
  ```python
  n = int(input())
graph = []
num = []

for i in range(n):
    graph.append(list(map(int, input())))

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]


def DFS(x, y):
    if x < 0 or x >= n or y < 0 or y >= n:
        return False

    if graph[x][y] == 1:
        global count
        count += 1
        graph[x][y] = 0
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            DFS(nx, ny)
        return True
    return False


count = 0
result = 0

for i in range(n):
    for j in range(n):
        if DFS(i, j) == True:
            num.append(count)
            result += 1
            count = 0

num.sort()
print(result)
for i in range(len(num)):
    print(num[i])
  ```
- 따라서, 자신에게 편한 방법 또는 문제에 따라 더 직관적으로 적용될 수 있는 방법을 사용하자
