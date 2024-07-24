package collectionT;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Removing_Dup_From_Collection {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		
		System.out.println("List with duplicate values:"+al);
		
		HashSet<Integer> s=new HashSet<>(al);
		
		System.out.println("After removig duplicates:"+s);
	}
}
