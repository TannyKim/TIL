package 알고리즘정렬;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = { 55, 7, 78, 12, 42 };

		int idx = 0;
		while (idx < array.length - 1) {
			if (array[idx] >= array[idx + 1]) {
				int temp = array[idx];
				array[idx] = array[idx + 1];
				array[idx + 1] = temp;
				idx = 0;
			}
			idx++;
		}
		System.out.println(Arrays.toString(array));
	}
}
