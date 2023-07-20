## 자바의 로그에 대해서 알아봅시다
# 자바는 자연로그만 제공한다
- 자연로그란 밑(base)가 10인 로그이다.
- 하지만 CS와 프로그래밍에서 로그는 base가 2인 로그를 기본으로 상정한다.
- 따라서 이를 변환해줄 필요가 있다.
```java
 public static void main(String[] args) {
        int a = 7;
        int b = 8;
        System.out.println(Math.log(a));
        System.out.println(Math.log(b));
        System.out.println(Math.log(2));
}

// 결과
// 1.9459101490553132
// 2.0794415416798357
// 0.6931471805599453
```
# 결론 : 원하는 base를 진수로 가진 자연로그로 나누어준다
- 만약 $\log_2 7$ 을 원한다면?
- $log 7 / log 2$ 를 해주자
```java
System.out.println(Math.log(7) / Math.log(2));

// 결과
// 2.807354922057604
```
- 실제 $\log_2 7$의 결과  
  ![image](https://github.com/TannyKim/TIL/assets/98008421/82f96120-2170-4b27-a4fd-41a978042c78)

# 왜 그럴까? : 로그의 성질
- 로그의 성질 : https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=junhyuk7272&logNo=221263448132
- 다음과 같은 순서로 $log_2 7$ 결과를 도출할 수 있다.
1. $log 7 /log 2$
2. $log 7 * \frac{1}{log 2}$
3. $log 7 * log_2 10$ => 8) 밑과 진수를 바꾸면 로그는 역수가 된다
4. $log_2 7 * log10$ => 4) 로그끼리의 곱은 밑끼리 자리 바꿀 수 있다
5. $log_2 7 * 1$ => 2) 밑과 진수가 같으면 값은 1이다.
6. $log_2 7$
  
