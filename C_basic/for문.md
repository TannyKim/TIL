## for
  * 반목문_반복회수가 정해졌을 때 사용.
  * 예시
    - ![image](https://user-images.githubusercontent.com/98008421/167134243-37b061bb-83be-4e74-a5d1-6ba88184a3a2.png)

  * for문 구조
    -  ![image](https://user-images.githubusercontent.com/98008421/167134307-2b440c0d-8c65-48e7-aec3-db77a3c2964a.png)

  * 실행 과정
    - ![image](https://user-images.githubusercontent.com/98008421/167134351-19f442a7-ba34-4799-9c1d-9f4550677001.png)

  * for문의 활용
    - 한 번도 실행하지 않을 수 있다.(최초 비교 조건이 거짓일 경우)
    - i-- 조건도 가능
    - 시작값과 조건을 다양하게 설정 가능
 
## 이중 for문, 중첩
  ```
  for(i = 0; i < 3; i++)
  {
      for(j = 0, j < 5; j++)
      {
      
      }
  }
  ```
   * 파이썬과 비교
     ```python
     for i in range(3):
         for j in range(5):
     ```
   * 회차 순서
     - (i , j) 에 대해서
     - i = 0 일 경우 j는 0 ~ 4 까지 회전
     - i = 1 이 되고, j는 다시 0 ~ 4 까지 회전
     - i = 2, j = 0 ~ 4 까지 회전하고 종료.
