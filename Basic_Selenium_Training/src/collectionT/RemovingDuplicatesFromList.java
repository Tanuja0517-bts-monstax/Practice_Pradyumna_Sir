package collectionT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicatesFromList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(1);
		al.add(12);
		al.add(22);
		al.add(12);
		al.add(23);
		al.add(22);
		al.add(12);
		al.add(15);
		al.add(16);
		System.out.println("Arraylist:"+al);
		
		Set s = new HashSet();
		s.addAll(al);
		System.out.println("Set:"+s);
		
		al.removeAll(al);
		al.addAll(s);
		System.out.println("Updated list:"+al);
	}
}
