package 스택;

import java.util.Scanner;
import java.util.Stack;

public class Stack_03_undo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<String> ctrlZ = new Stack<>();
		Stack<String> ctrlY = new Stack<>();

		String work = "작업1";

		while (true) {
			System.out.println("1. 새로운 작업");
			System.out.println("2. Ctrl + Z");
			System.out.println("3. Ctrl + Y");
			System.out.println("이외. 종료");

			int cmd = sc.nextInt();

			if (cmd == 1) {
				ctrlZ.add(work);
				System.out.print("작업을 입력하세요 : ");
				work = sc.next();
				ctrlY.clear();
				System.out.println(work);

			} else if (cmd == 2) {
				if (ctrlZ.isEmpty()) {
					System.out.println("이전 작업이 없습니다.");
					continue;
				} else {
					ctrlY.add(work);
					work = ctrlZ.pop();
					System.out.println(work);
				}
			} else if (cmd == 3) {
				if (ctrlY.isEmpty()) {
					System.out.println("작업이 없습니다.");
					continue;
				} else {
					ctrlZ.add(work);
					work = ctrlY.pop();
					System.out.println(work);
				}
			} else {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
