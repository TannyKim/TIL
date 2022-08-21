package 스택;

import java.util.Scanner;

public class Stack_02_괄호검사 {
	static char[] stack = new char[10];
	static int top = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			if (temp == '(' || temp == '{' || temp == '[') {
				stack[++top] = temp;
			} else if (temp == ')') {
				if (stack[top] == '(') {
					stack[top--] = '0';
				} else {
					System.out.println("오류 : 비정상 괄호 '()");
					break;
				}
			} else if (temp == '}') {
				if (stack[top] == '{') {
					stack[top--] = '0';
				} else {
					System.out.println("오류: 비정상 괄호'{}");
					break;
				}
			} else if (temp == ']') {
				if (stack[top] == '[') {
					stack[top--] = '0';
				} else {
					System.out.println("오류: 비정상 괄호'[]'");
					break;
				}
			}
		}
		if (top == -1) {
			System.out.println("정상");
		} else {
			System.out.println("오류: 괄호 닫히지 않음.");
		}

	}
}
