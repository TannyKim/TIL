package 알고리즘정렬;

import java.util.Arrays;

public class SelectionSort {
	static int[] array = { 64, 88, 12, 87, 8, 321, 123 };
	public static void main(String[] args) {

		int idx = 0;
		int minIdx = 0;
		int memoryIdx = 0;
		while (minIdx < array.length - 1) {
			int temp = array[minIdx];
			int flag = 0;
			while (idx < array.length - 1) {
				if (temp > array[idx + 1]) {
					temp = array[idx + 1];
					memoryIdx = idx + 1;
					flag = 1;
				}
				idx++;
			}
			if (flag == 1) {
				array[memoryIdx] = array[minIdx];
				array[minIdx] = temp;				
			}
			minIdx++;
			idx = minIdx;
			memoryIdx = 0;
		}
		System.out.println(Arrays.toString(array));
	}
}
