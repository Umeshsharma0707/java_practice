package collectionsFrameWork;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
		public static void main(String[] args) {
			
			ArrayDeque<Integer> ad = new ArrayDeque<>();
			
			ad.offer(20);  // to input
			ad.offerFirst(30);
			ad.offerLast(15);
			ad.offerFirst(21);
			ad.offer(39);
			System.out.println(ad);
			
			ad.pollFirst();  // remove first
			System.out.println(ad);  
			System.out.println(ad.peekLast());  // give peek last 
			ad.pollLast();
			System.out.println(ad);
			System.out.println(ad.peek());
			ad.poll();
			System.out.println(ad);
			
			
		}
}
