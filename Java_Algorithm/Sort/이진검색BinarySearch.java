package 알고리즘정렬;

import java.util.Arrays;

public class 이진검색BinarySearch {
	static int[] nums = { 8, 123, 18, 321, 45, 418, 324, 64 };

	public static void main(String[] args) {
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println(binarySearch(30));
		
	}
	
	static int binarySearch(int key) {
		int start = 0;
		int end = nums.length - 1;
		int mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (nums[mid] == key)
				return key;
			else if (nums[mid] > key)
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}
	
	
}
