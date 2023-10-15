package collectionsFrameWork;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		pq.offer(10);
		pq.offer(200);
		pq.offer(30);
		pq.offer(8);
		System.out.println(pq);
		
		pq.poll();
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
	}
}
