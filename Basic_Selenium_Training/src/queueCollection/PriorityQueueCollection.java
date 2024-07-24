package queueCollection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueCollection {
	public static void main(String[] args) {
		Queue pq=new PriorityQueue<>();
		pq.add(25);
		pq.add(5);
		pq.add(12);
		pq.add(145);
		
		System.out.println("Entire PriorityQueueCollection:"+pq);
	}
}
