package 알고리즘정렬;

import java.util.Arrays;

public class 카운팅정렬 {
	static int[] array = {42, 95, 33, 7, 88, 5, 77, 10, 31, 5 };

	public static void main(String[] args) {

		// 1) 최대 정수를 포함하는 배열 생성
		int max = 0;
		for (int i : array) {
			if (max < i) {
				max = i;
			}
		}

		// 2) 개수를 카운팅
		int[] count = new int[max + 1];
		for (int i : array) {
			count[i]++;
		}

		// 3) 누적합
		for (int i = 1; i <= max; i++) {
			count[i] = count[i] + count[i - 1];
		}
//		System.out.println(Arrays.toString(count));
		// [1, 4, 5, 6, 8]
		
		
		// 4) 뒤부터 읽어서 정렬
		int[] temp = new int[array.length];
		for (int i = array.length - 1 ; i >= 0; i--) {
			int idx = count[array[i]] - 1;
			temp[idx] = array[i];
			count[array[i]]--;
		}
		
		System.out.println(Arrays.toString(temp));
	}
}
