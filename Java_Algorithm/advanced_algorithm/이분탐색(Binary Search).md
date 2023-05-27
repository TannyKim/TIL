## 구현 방법

이분 탐색의 구현은 Check(lo) != Check(hi)가 되도록 lo, hi의 초기값을 잘 설정해준 뒤</br>
lo + 1 < hi인 동안 mid = (lo + hi) / 2를 구해서 </br>
Check(lo) == Check(mid)라면 lo = mid를, Check(hi) == Check(mid)라면 hi = mid를 해주면 됩니다.</br>
</br>
우선 초기 상태의 lo, hi가 Check(lo) != Check(hi)이기 때문에 결정 문제의 답이 바뀌는 경계는 [lo, hi] 내에 있음이 보장됩니다.</br>
</br>
이제 lo + 1 < hi인 동안 [lo, hi]를 [lo, mid] 또는 [mid, hi]로 줄여나가는데, 이 경우 Check(lo), Check(hi)는 바뀌지 않습니다. </br>
이유는 Check(lo) == Check(mid)라면 lo = mid를, Check(hi) == Check(mid)라면 hi = mid를 하기 때문입니다. </br> 
또한 lo + 1 < hi이기 때문에 lo와 hi의 사이에는 무조건 한 개 이상의 칸이 있으며, mid는 항상 lo < mid < hi를 만족합니다. </br>
따라서 구간의 길이는 매번 절반씩 줄어들며 언젠간 lo + 1 == hi가 되어서 반복문을 탈출하게 됩니다.</br>
</br>
(반복문을 탈출했다면 lo + 1 >= hi인데 lo < mid < hi인 mid를 대입하기 때문에 lo < hi이고, 두 조건을 만족하는 lo, hi는 lo + 1 == hi인 경우밖에 없습니다)</br>

이분 탐색이 끝나면 lo, hi는 결정 문제의 답이 바뀌는 경계에 위치하게 되며, </br>
만약 결정 문제 답의 분포가 F~T인데 **정답이 가장 큰 F라면 lo를, 가장 작은 T라면 hi를 출력**해주면 됩니다.</br>

1. 경계를 포함하도록, 즉 Check(lo) != Check(hi)가 되도록 [lo, hi]를 잡음
![image](https://github.com/TannyKim/TIL/assets/98008421/b4fd7148-02ea-430b-a3ec-e2f8a4a517b3)
2. Check(lo) == mid라면 lo = mid, 아니라면 hi = mid를 반복
![image](https://github.com/TannyKim/TIL/assets/98008421/c5748960-4451-4b1b-8c92-a37faa5bf102)
3. lo + 1 == hi가 되면 탈출, lo, hi는 경계에 위치
![image](https://github.com/TannyKim/TIL/assets/98008421/5ec5ce8a-079d-4963-bf76-42e871569327)
