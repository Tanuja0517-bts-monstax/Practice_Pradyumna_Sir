package collectionT;

import java.util.ArrayList;

public class SpecificDatatypeElementDisplayFromArrayList {
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add("Abcd");
		al.add('a');
		al.add(123);
		al.add('z');
		al.add(12.12);
		
		System.out.println(al);
		
		for(Object obj:al) {
			if(obj.getClass().equals(Character.class))
				System.out.println(obj);
		}
	}
}
