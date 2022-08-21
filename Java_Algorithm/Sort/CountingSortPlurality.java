package 알고리즘정렬;

import java.util.Arrays;

public class CountingSortPlurality {
	static int[][] array = { { 0, 3 }, { 4, 0 }, { 1, 2 }, { 3, 3 }, { 1, 4 }, { 2, 1 }, { 4, 1 }, { 1, 3 } };

	public static void main(String[] args) {
		// 최초 데이터의 두번째 원소 기준으로 정렬 시작.
		// 최대 정수 만큼 배열 만들기
		int max = 0;

		for (int[] inner : array) {
			if (max < inner[1]) {
				max = inner[1];
			}
		}
		int[] count1 = new int[max + 1];

		// 두번째 원소 기준, 정수가 각각 몇번씩 나왔는지 카운트
		for (int[] inner : array) {
			count1[inner[1]]++;
		}

		// 누적합 구하기.
		for (int i = 1; i <= max; i++) {
			count1[i] = count1[i] + count1[i - 1];
		}

		// 두번째 원소를 뒤에서부터 읽으면서, count로 부터 index를 가져와서 정렬.
		int[][] temp1 = new int[array.length][2];
		for (int i = array.length - 1; i >= 0; i--) {
			int idx1 = count1[array[i][1]] - 1;
			temp1[idx1] = array[i];
			count1[array[i][1]]--;
		}
//		System.out.println(Arrays.deepToString(temp1));
// 		[[4, 0], [2, 1], [4, 1], [1, 2], [0, 3], [3, 3], [1, 3], [1, 4]]

		// 중간 정렬 데이터 (temp1)의 첫번째 원소를 기준으로 정렬 시작
		// 첫번째 원소를 기준으로 정수 최대값 만큼 배열 생성
		max = 0;
		for (int[] inner : temp1) {
			if (max < inner[0]) {
				max = inner[0];
			}
		}
		int[] count2 = new int[max + 1];

		// 첫번째 원소 기준, 각 정수가 몇 번나왔는지 카운트
		for (int[] inner : temp1) {
			count2[inner[0]]++;
		}

		// 누적합
		for (int i = 1; i <= max; i++) {
			count2[i] = count2[i] + count2[i - 1];
		}

		// 뒤에서 부터 첫번째 원소를 읽어와서, count에서 index를 참조하여 정렬.
		int[][] temp2 = new int[temp1.length][2];
		for (int i = temp1.length - 1; i >= 0; i--) {
			int idx2 = count2[temp1[i][0]] - 1;
			temp2[idx2] = temp1[i];
			count2[temp1[i][0]]--;
		}
		System.out.println(Arrays.deepToString(temp2));

	}
}
