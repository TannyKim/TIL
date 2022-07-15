package 두번째날;

import java.util.Scanner;

public class SWEA_2068_최대수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 1; i < t + 1; i++) {
			int largest = 0;
			for (int j = 0; j < 10; j++) {
				int compare = sc.nextInt();
				if (largest < compare) {
					largest = compare;
				}
			}
			System.out.println("#"+ i + " " + largest);
		}
	}
}
