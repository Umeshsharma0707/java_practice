package collectionsFrameWork;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public static void main(String[] args) {
		
		Queue<Integer> queue  = new LinkedList<>();
		
		queue.offer(10); // to input in the queue
		queue.offer(20);
		queue.offer(30);  // same as offer
		
		System.out.println(queue);
		
		System.out.println(queue.poll());  // to remove the element
		
		System.out.println(queue.peek());
		
		System.out.println(queue);
		
	}
}
