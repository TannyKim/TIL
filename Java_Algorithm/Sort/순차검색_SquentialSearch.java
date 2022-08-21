package 알고리즘정렬;

import java.util.Arrays;

public class 순차검색_SquentialSearch {
	static int[] nums = { 8, 123, 18, 321, 45, 418, 324, 64 };

	public static void main(String[] args) {
		System.out.println(searchForNoSort(45));
		System.out.println(searchWhileNoSort(33));

		Arrays.sort(nums);

		System.out.println(searchForSort(44));
		System.out.println(searchWhileSort(45));

	}

	static boolean searchForNoSort(int key) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == key) {
				return true;
			}
		}
		return false;
	}

	static boolean searchWhileNoSort(int key) {
		int idx = -1;
		while (++idx != nums.length) {
			if (nums[idx] == key) {
				return true;
			}
		}
		return false;
	}

	static int searchForSort(int key) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == key) {
				return i;
			}
		}
		return -1;
	}

	static int searchWhileSort(int key) {
		int idx = 0;
		while (idx != nums.length) {
			if (nums[idx] == key) {
				return idx;
			}
			idx++;
		}
		return -1;
	}

}
