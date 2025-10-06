package EngineeringDigestCollection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListComparator implements Comparator<String> {
	/* For Integer Descendant
	public int compare(Integer i,Integer j) {
		return j-i;
	}
	public static void main(String[] args) {
		List< Integer> li = new ArrayList<Integer>();
		li.add(6);
		li.add(4);
		li.add(1);
		li.add(3);
		System.out.println("Before:"+li);
		li.sort(new ArrayListComparator());
		System.out.println("After:"+li);
	}*/
	
	/*Sorting strings  on length wise
	public int compare(String s,String t) {
		return s.length()-t.length();
	}
	
	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("Mango");
		li.add("Bananaa");
		li.add("Date");
		li.add("Apple");
		li.add("Cherry");
		System.out.println("Before:"+li);
		li.sort(null);
		System.out.println("Sorting based on alphabate:"+li);
		li.sort(new ArrayListComparator());
		System.out.println("Sorting based on string length:"+li);
	}*/
	
	/*Sorting based on string length descending order*/
	public int compare(String s,String t) {
		return t.length()-s.length();
	}
	
	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("Mango");
		li.add("Bananaa");
		li.add("Date");
		li.add("Apple");
		li.add("Cherry");
		System.out.println("Before:"+li);
		li.sort(null);
		System.out.println("Sorting based on alphabate:"+li);
		li.sort(new ArrayListComparator());
		System.out.println("Sorting based on string length:"+li);
	}
}
