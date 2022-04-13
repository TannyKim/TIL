## Union-Find (합집합 찾기)
* 대표적인 그래프 알고리즘
* 여러 개의 노드가 존재할 때, 두 개의 노드를 선택해서, 현재 이 두 노드가 서로 같은 그래프에 속하는 지 판별하는 알고리즘
* strongly-connecte-component 등 고급 알고리즘에서도 사용된다.

## 동작 원리
 * 다음과 같이 노드가 자유롭게 존재한다고 생각해보자.
   ![image](https://user-images.githubusercontent.com/98008421/163124222-603e87d5-6daa-4a0a-873a-c85d1a742864.png)
 * 이처럼 연결되지 않고, 각자 자기 자신만을 집합으로 가지고 있는 경우를 배열을 통해 표현하면 다음과 같다
   ![image](https://user-images.githubusercontent.com/98008421/163124566-460355ea-f63c-4733-9064-21fbd0bbf325.png)
 * 그렇다면 노드가 연결되었을 경우를 생각해보자
   ![image](https://user-images.githubusercontent.com/98008421/163124884-74c3ae16-8028-4f37-8b26-1d2ce4c95820.png)
   - 이와 같이, 2번째 인덱스 값에 '1' 들어간다.
   - **부모를 합칠 때는 일반적으로 더 작은 값 쪽으로 합친다** 이것을 Union이라고 한다.
 * 2와 3이 연결될 경우에는? 다음과 같이 표현된다
   ![image](https://user-images.githubusercontent.com/98008421/163125308-e6c3305b-a9be-435e-9d6c-34722176f983.png)
   - 이처럼 2와 3 중 작은 값인 '2'가 3번째 인덱스 값에 들어가게 된다.
   - 하지만 이럴 경우, 1과 3이 연결되어 있는지는 한번에 파악할 수 없다.
   - 따라서 ***재귀함수***가 사용된다
   - 3이 가리키고 있는 2를 찾고, 2가 가리키고 있는 1을 찾는다. 이 과정을 통해 다음과 같은 배열이 완성된다.
 ![image](https://user-images.githubusercontent.com/98008421/163126026-ad32430c-b1dd-4871-b0e5-20a55f8ba370.png)

   
 * 파이썬 코드
```python
 # 특정 원소가 속한 집합 찾기
 def find_parent(parent, x):
    # 루트 노드를 찾을 때까지 재귀 호출
    if parent[x] != x:
        return find_parent(parent, parent[x])
    return x
 
 # 두 원소가 속한 집합을 합치기
 def union_parent(parent, a, b):
     a = find_parent(parent, a)
     b = find_parent(parent, b)
     if a < b:
         parent[b] = a
     else:
         parent[a] = b
  
  # 노드의 개수와 간선(Union 연산)의 개수 입력 받기
  v, e = map(int, input().split())
  parent = [0] * (v + 1) # 부모 테이블 초기화하기
  
  # 부모 테이블상에서, 부모를 자기 자신으로 초기화
  for i in range(1, v + 1):
      parent[i] = i
  
  # Union 연산을 각각 수행
  for i in range(e):
      a, b = map(int, input().split())
      union_parent(parent, a, b)
  
  # 각 원소가 속한 집합 출력하기
  print('각 원소가 속한 집합: ', end='')
  for i in range(1, v + 1):
      print(find_parent(parent, i), end='')
  
  print()
  
  # 부모 테이블 내용 출력하기
  print('부모 테이블: ', end='')
  for i in range(1, v + 1):
      print(parent[i], end='')
```

## 기본적인 문제점
   * ![image](https://user-images.githubusercontent.com/98008421/163128395-69ff99f7-6bb6-4066-8f39-327a7718444b.png)
   * 해결방법:
     - 찾기 함수를 재귀적으로 호출한 뒤 부모 테이블에 값을 바로 갱신!
     ``` python
     # 특정 원소가 속한 집합 찾기
     def find_parent(parent, x):
     # 루트 노드가 아니라면, 루트노드를 찾을 지 재귀 호출
         if parent[x] != x:
            parent[x] = find_parent(parent, parent[x])
         return parent[x]
     ```
 
 ## 더 직관적인 코드
 ```python
 def find(x):
     if x == parent[x]:
         return x
     else:
          p = find(parent[x])
          parent[x] = p
          return parent[x]
 def union(x, y):
     x = find(x)
     y = find(y)
     
     parent[y] = x
     
 parent = []
 
 for i in range(0, 5):
     parent.append(i)
 
 union(1, 4)
 union(2, 4)
 
 for i in range(1, len(parent)):
     print(find(i), end=''
 
 
 ## 출처
  + https://youtu.be/Ha0w2dJa2Nk
  + https://blog.naver.com/ndb796/221230967614

