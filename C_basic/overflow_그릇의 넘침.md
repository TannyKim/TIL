## **overflow**
  * 작은 그릇에는 큰 값을 담을 수 없다
  * ![image](https://user-images.githubusercontent.com/98008421/166648934-eece98f4-c3e2-46ec-b8cc-5799e4df3821.png)
  * ![image](https://user-images.githubusercontent.com/98008421/166649132-557aeb39-9e36-4218-8307-c87124141c57.png)


## 상황 설명
   * 나이를 저장한다고 해보자
     - 일반적인 나이 범위는 넉넉히 잡아도 0 ~ 200
     - signed char a; : -128 ~ 128 이므로 130세는 저장 불가! -> unsigned char a; 이 적절
     - signed short b; : 범위를 만족함 (unsigned로 해도 적절함)
     - signed int c; : 범위는 만족하지만 낭비가 심하다! -> 메모리관리 측면에서 부적절.
   
   * 연봉을 저장한다고 해보자
      - 3000 ~ 1억
      - signed(unsigned) char(short) a(b); 를 해도 저장 범위를 만족하지 못함
      - signed(unsigned) int c; 범위를 만족한다 
   
   * **따라서 항상 저장하고 싶은 값을 기준으로 어떤 그릇(변수)가 적절할지 따져봐야 한다.
     - 가장 큰 값을 가지고 적절한 범위를 따져보고, (메모리를 작게 설정하여 **overflow** 되면 저장을 못한다.)
     - 쓸데 없이 크지는 않은지 따져본다 (메모리가 클 수록 처리에 시간이 많이 소요된다.)
