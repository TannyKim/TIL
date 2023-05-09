# 플로이드 워셜
* '모든 정점' 에서 '모든 정점'으로의 최단 경로
  - vs. 다익스트라 : '하나의 정점'에서 '다른 모든 정점'으로의 최단 경로
* **거쳐가는 정점**을 기준으로 알고리즘을 수행

## 설명
* 그래프
![image](https://github.com/TannyKim/TIL/assets/98008421/a53333f8-472a-4cfa-97fa-35423059db35)
  - 비용 2차원 배열(초기값)
    ![image](https://github.com/TannyKim/TIL/assets/98008421/ef647f32-57ab-4a7f-b6b0-08c639bf3302)
    + '현재까지 계산된 최소 비용' 의미
    + 이 이차원 배열을 반복적으로 갱신하여 최종적으로 모든 최소 비용을 구해야함.
## 알고리즘 수행
1. 노드 1을 거쳐가는 경우.
* 배열 갱신할 곳
  ![image](https://github.com/TannyKim/TIL/assets/98008421/d1936c30-39ef-4a36-a2cd-3f84e016fba2)
  - 노란색 부분 6곳만 갱신해주면 된다
  - X에서 Y로가는 최소비용 vs X에서 노드 1로 가는 비용 + 노드 1에서 Y로가는 비용
    + 1을 거쳐서 가는 경우가 더 빠르다면, 그 경우로 최소 비용을 계산하는 것
    + ex) D[2, 3] = Math.min(D[2, 3], D[2, 1], D[1, 3])
    + D[X, X] 꼴은 자기 자신이므로 무시,
    + D[1, X] 또는 D[X, 1] 형태는 1을 거쳐가는 형태가 아니라 바로 가는 형태이므로 무시.
* 갱신 후
  ![image](https://github.com/TannyKim/TIL/assets/98008421/de202063-fc11-46b6-a993-8d1dbb70a9fc)

2. 노드 2를 거쳐가는 경우.
* 배열 갱신할 곳
  ![image](https://github.com/TannyKim/TIL/assets/98008421/009b38cb-4ee4-4a85-88e2-e9a8e991b4d0)
* 갱신 후
  ![image](https://github.com/TannyKim/TIL/assets/98008421/6654aae1-015b-4b0c-bf6f-9ad6b10a5764)
  
3. 노드 3, 4에 대해서도 수행
* 결과
  ![image](https://github.com/TannyKim/TIL/assets/98008421/ad3c2a17-bb86-461d-a14a-d3c5bc2cd085)

# 소스코드

```java
public class Practice_FloydWarshall {
    static int num = 4;
    static int INF = 1_000_000_000;
    static int[][] map;

    public static void main(String[] args) {

        // 그래프 배열 초기화
        map = new int[][] {
            {0, 5, INF, 8},
            {7, 0, 9, INF},
            {2, INF, 0, 4},
            {INF, INF, 3, 0}
        };

        floydWarshall();

    }

    private static void floydWarshall() {
        // 결과 그래프 초기화화
       int[][] dist = new int[num][num];

       for (int i = 0; i < num; i++) {
           for (int j = 0; j < num; j++) {
               dist[i][j] = map[i][j];
           }
       }

       // k = 거쳐가는 노드
        for (int k = 0; k < num; k++) {
            // i = 출발 노드
            for (int i = 0; i < num; i++) {
                //j = 도착 노드
                for (int j = 0; j < num; j++) {
                    if (dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // 결과를 출력합니다.
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```
