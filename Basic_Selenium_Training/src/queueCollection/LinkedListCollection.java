package queueCollection;

import java.util.LinkedList;

public class LinkedListCollection {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList<>();
		ll.add(12);
		ll.add("GM");
		ll.add(1, "Hey");
		ll.addFirst('T');
		ll.addLast('E');
		
		System.out.println("Entire LinkedListCollection:"+ll);
		ll.remove(2);
		System.out.println("LinkedListCollection after removing element:"+ll);
	}
}
