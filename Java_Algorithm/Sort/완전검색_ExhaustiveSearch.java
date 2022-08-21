package 알고리즘정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 완전검색_ExhaustiveSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[6];
		int card;
		for (int i = 0; i < 6; i++) {
			card = sc.nextInt();
			array[i] = card;
		}
		int midCal = isTriplet(array);
		int finCal;
		if (midCal == -2) {
			System.out.println("Baby-gin");
		} else if(midCal == -1) {
			finCal = isRun(array);
			if (finCal == 2) {
				System.out.println("Baby-gin");
			} else {
				System.out.println("Is Not Baby-gin");
			}
		} else {
			int[] newArray = {-1, -1, -1};
			int newIdx = 0;
			int cnt = 0;
			for (int j : array) {
				if (j != midCal) {
					newArray[newIdx++] = j;
				} else if (j == midCal) {
					cnt++;
				}
				if (cnt == 3 && j == midCal) {
					for (int i : newArray) {
						if (i == -1) {
							newArray[newIdx] = j;							
						}
					}
				}
			}
			finCal = isRun(newArray);
			if (finCal == 1) {
				System.out.println("Baby-gin");
			} else {
				System.out.println("Is Not Baby-gin");
			}
		}
		

	}

	static int isTriplet(int[] array) {
		int[] temp = new int[10];
		for (int i : array) {
			temp[i]++;
		}
		int cnt = 0;
		for (int t : temp) {
			if (t >= 3)
				cnt++;
		}
		if (cnt == 2) {
			return -2;
		} else if (cnt == 1) {
			for (int i = 0; i < temp.length; i++) {
				if (temp[i] >= 3)
					return i;
			}
		}
		return -1;
	}

	static int isRun(int[] array) {
		int[] temp = new int[10];
		for (int i : array) {
			temp[i]++;
		}
		int cnt = 0;
		int idx = 0;
		while (idx != 8) {
			if (temp[idx] > 0 && temp[idx + 1] > 0 && temp[idx + 2] > 0) {
				cnt++;
				temp[idx]--;
				temp[idx + 1]--;
				temp[idx + 2]--;
				idx = 0;
			}
			idx++;
		}
		if (cnt == 2) {
			return 2;
		} else if (cnt == 1) {
			return 1;
		}
		return 0;
		
	}
}
