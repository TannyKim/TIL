### UNION-FIND(합집합 찾기)

* 각자 자신만을 집합의 원소로 가지고 있다.
  + ![image](https://user-images.githubusercontent.com/98008421/236656211-37a3db5d-7917-4b8d-82c9-6ad722e97923.png)

* 배열로 이렇게 표현 가능하다.
  + ![image](https://user-images.githubusercontent.com/98008421/236656229-12e25c74-9b9c-4542-989c-18286daf0b9d.png)
    - 노드 번호
    - 부모 노드

* 이렇게 연결해주자
  + ![image](https://user-images.githubusercontent.com/98008421/236656306-36aed031-ff3f-471f-a88f-a09905c97e82.png)
    - uninoParent

* 이렇게 연결하면?
  + ![image](https://user-images.githubusercontent.com/98008421/236656418-bac59559-3a7f-4a18-95a3-fefb398be7e9.png)
* 결과가 잘 나온다
  + ![image](https://user-images.githubusercontent.com/98008421/236656491-48758fc7-869d-4dbc-bf63-19629906445c.png)
    - 1과 8의 경우는 findParent()를 호출해 주어야 배열상에 반영된다는 것을 참고하자. 
    - 논리적으로는 연결되어있지만 물리적으로는 업데이트 되어있지 않다. 문제풀때 주의!

```java
import java.util.Arrays;

public class Practice_UnionFind {

    public static void main(String[] args) {
        int[] parent = new int[9];
        for (int i = 1; i <= 8; i++) {
            parent[i] = i;
        }

        unionParent(parent, 1, 2);
        unionParent(parent, 2, 3);
        unionParent(parent, 3, 4);
        unionParent(parent, 5, 6);
        unionParent(parent, 6, 7);
        unionParent(parent, 7, 8);
        System.out.println("1과 5는 연결되어 있나요? " + findParent(parent, 1, 5));
        System.out.println(Arrays.toString(parent));
        unionParent(parent, 1, 5);
        System.out.println("1과 5는 연결되어 있나요? " + findParent(parent, 1, 5));
        System.out.println(Arrays.toString(parent));
        System.out.println("1과 8는 연결되어 있나요? " + findParent(parent, 1, 8));
        System.out.println(Arrays.toString(parent));
    }

    // 부모 노드 찾기
    private static int getParent(int parent[], int x) {
        if (parent[x] == x) return x;
        return parent[x] = getParent(parent, parent[x]);
    }

    // 두 부모 노드를 합치는 함두
    private static void unionParent(int parent[], int a, int b) {
        a = getParent(parent, a);
        b = getParent(parent, b);
        if (a < b) parent[b] = a;
        else parent[a] = b;
    }

    // 같은 부모를 가지는 지 확인
    private static boolean findParent(int parent[], int a, int b) {
        a = getParent(parent, a);
        b = getParent(parent, b);
        if (a == b) return true;
        else return false;
    }


}


```

