## DFS (Depth-First Search)
 * 깊이 우선 탐색, 깊은 부분을 우선적으로 탐색하는 알고리즘
 * 스택 자료구조(혹은 재귀함수)를 이용
 * 동작 과정
   1. 탐색 시작 노드를 스택에 삽입하고 방문 처리
   2. 스택의 최상단 노드에 방문하지 않은 인접한 노드가 하나라도 있으면 그 노드를 스택에 넣고 방문처리,
      방문하지 않은 인접 노드가 없으면 스택에서 최상단 노드를 꺼냄.
   3. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복
  
  * 그림 예시
  - 그래프 준비(무방향성, 방문 기준: 번호가 낮은 인접 노드 부터, 시작 노드: 1)
  + ![image](https://user-images.githubusercontent.com/98008421/163948513-61ce8665-a508-4b27-b9eb-8eedd722f6ec.png)
  - 스택 순서도 (눈으로 따라가 보자!)
  + ![image](https://user-images.githubusercontent.com/98008421/163956338-e306040d-12c5-46b5-9bbb-471cf22bb661.png)
  - 탐색 순서
     + 1 -> 2 -> 7 -> 6 -> 8 -> 3 -> 4 -> 5
  
  * 파이썬 코드
  ```python
  # DFS 메서드 정의
  def dfs(graph, v, visited):
      # 현재 노드를 방문 처리
      visited[v] = True
      print(v, end = ' ')
      # 현재 노드와 연결된 다른 노드를 재귀적으로 방문
      for i in graph[v]:
          if not visited[i]: # visited[i] == False라면,
              dfs(graph, i, visited) # visited[i] = True 실행
              
  # 각 노드가 연결된 정보를 표현(2차원 리스트)           
  graph = [[], [2, 3, 8], [1, 7], [1, 4, 5], [3, 5], [3, 4], [7], [2, 6, 8], [1, 7]] 
  
  # 각 노드가 방문된 정보를 표현 (1차원 리스트)
  visited = [False] * 9
  
  '''
  인접 리스트 방식으로 graph를 구현, 구현 상 1~8번 노드까지 가지고 있기 때문에,
  하나 더 큰 숫자로 graph와 visited를 표현하고, 인덱스 0번값은 사용하지 않는 방식으로 구현.
  물론, 코드상에서 각각의 노드에서 1을 뺀값으로 처리할 수 있지만, 좀 더 직관적으로 맵핑하기 위해 위와 같은 방법을 이용한다.
  '''
  
  # 정의된 DFS 함수 호출
  dfs(graph, 1, visited)
  
  >> 1 2 7 8 3 4 5
  ```
  ## BFS (Breadth-First Search)
   * 너비 우선 탐색, 가까운 노드부터 우선적으로 탐색하는 알고리즘
   * 큐 자료구조 이용.
   * 동작 과정
     1. 탐색 시작 노드를 큐에 삽입하고 방문처리
     2. 큐에서 노드를 꺼낸 뒤에 해당 노드의 인접 노드 중에서 방문하지 않은 노드를 모두 큐에 삽입하고 방문 처리.
     3. 더 이상 2번의 과정을 수행할 수 없을 때까지 반복.
   
   * 그림 예시
   - 그래프 준비(무방향성, 방문 기준: 번호가 낮은 인접 노드 부터, 시작 노드: 1)
   + ![image](https://user-images.githubusercontent.com/98008421/163953210-a6106a2d-7f33-4540-a5bd-930d73f1fc44.png)
   - 큐 순서도 (눈으로 따라가 보자!)
   + ![image](https://user-images.githubusercontent.com/98008421/163956525-6b80c0d0-378d-4664-984a-40f91692c764.png)
   - 탐색 순서
     + 1 -> 2 -> 3 -> 8 -> 7 -> 4 -> 5 -> 6
  
   * 파이썬 코드
   ```python
   from collections import deque
   
   # BFS 메서드 정의
   def bfs(graph, start, visited):
       # 큐(queue) 구현을 위해 deque 라이브러리 사용
       queue = deque([start])
       # 현재 노드를 방문 처리
       visited[start] = True
       # 큐가 빌 때 까지 반복
       while queue:
           # 큐에서 하나의 원소를 뽑아 출력하기
           v = queue.popleft()
           print(v, end = ' ')
           # 아직 방문하지 않은 인접한 원소들을 큐에 삽입
           for i in graph[v]:
               if not visited[i]:
                   queue.append(i)
                   visited[i] = True
  
  # 각 노드가 연결된 정보를 표현(2차원 리스트)           
  graph = [[], [2, 3, 8], [1, 7], [1, 4, 5], [3, 5], [3, 4], [7], [2, 6, 8], [1, 7]] 
  
  # 각 노드가 방문된 정보를 표현 (1차원 리스트)
  visited = [False] * 9
  
  # 정의된 BFS 함수 호출
  bfs(graph, 1, visited)
  
  >> 1 2 3 8 7 4 5 6
  ```
 출처: https://youtu.be/7C9RgOcvkvo
   
   
   
   
