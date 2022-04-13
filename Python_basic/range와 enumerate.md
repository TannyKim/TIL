## range
  * range(시작숫자, 종료숫자, step)
    ```python
     >>>list(range(10, 20, 2))
     [10, 12, 14, 16, 18]
    ```
  
  * for 문에서 사용할 경우
    ```python
    for i in range(5):
      print(i)
    ```
    - 하지만 이하는 파이썬에서 권장하지 않음
    ```python
    s = [1, 3, 5]
    for i in range(len(s)):
      print(i)
    ```

## enumerate
  * 반복문 사용 시 몇 번째 반복문인지 확인이 필요할 수 있음.
  * 인덱스 번호와 컬렉션의 원소를 tuple 형태로 반환
  ```python
  t = [1, 5, 7, 33, 39, 52]
  for i in enumerate(t):
    print(p)
  
  (0, 1)
  (1, 5)
  (2, 7)
  (3, 33)
  (4, 39)
  (5, 52)
  ```
  * tuple 형태 반환을 이용하여 다음과 같이 활용할 수 있음
  ```python
  for idx, i in enumerate(t):
    print("index: {}, value: {}".format(idx, v))
  
  index: 0, value: 1
  index: 1, value: 5
  index: 2, value: 7
  index: 3, value: 33
  index: 4, value: 39
  index: 5, value: 52
  ```
  
  출처: https://wikidocs.net/16045
