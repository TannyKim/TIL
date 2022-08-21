package 스택;

public class Stack_01_구현 {
	static int[] stack = new int[10];
	static int top = -1;

	public static void main(String[] args) {
		System.out.println(isEmpty());
		System.out.println(isFull());
		
		stackPush(1);
		stackPush(11);

		System.out.println(isEmpty());
		System.out.println(isFull());
	}

	static boolean isEmpty() {
		return top == -1;
	}

	static boolean isFull() {
		return top == stack.length - 1;
	}

	static void stackPush(int value) {
		if (!isFull()) {
			stack[++top] = value;
		}
	}

	static int stackPop() {
		if (!isEmpty()) {
			return stack[top--];
		} else {
			return 0;
		}
	}

}
