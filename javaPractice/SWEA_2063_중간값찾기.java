package 두번째날;

import java.util.Arrays;
import java.util.Scanner;

public class SWEA_2063_중간값찾기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int arry[] = new int[t];
		int idx = 0;
		for (int i = 1; i < t + 1; i++) {
			arry[idx] = sc.nextInt();
			idx++;
		}
		Arrays.sort(arry);
		int find = (idx - 1) / 2;
		System.out.println(arry[find]);
	}

}
