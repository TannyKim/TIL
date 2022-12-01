package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_02_API {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		// 추가
//		queue.add(10);
//		queue.offer(10);

		// 삭제
//		System.out.println(queue.remove());
//		System.out.println(queue.remove()); //예외발생
//		System.out.println(queue.poll());
//		System.out.println(queue.poll()); //널값이 반환

		// 조회
//		System.out.println(queue.element());
//		System.out.println(queue.peek());

		// add, remove, element : 예외발생시킴.

		// offer, poll, peek : 값을 반환.

	}
}
