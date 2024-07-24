package listCollection;

import java.util.List;
import java.util.Stack;

public class StackCollection {
	public static void main(String[] args) {
		Stack s=new Stack<>();
		s.add("Hello");
		s.push(125);
		s.push(3.14f);
		s.push(145.23);
		s.push('t');
		
		System.out.println("Entire Stack:"+s);
		s.pop();
		System.out.println("After poping one element:"+s);
		System.out.println("Peek:"+s.peek());
		boolean isPresent=s.contains(125);
		System.out.println("Contains:"+isPresent);
	}
}
