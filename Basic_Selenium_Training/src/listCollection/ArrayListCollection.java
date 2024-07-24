package listCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListCollection {
	public static void main(String[] args) {
		List l=new ArrayList();
		l.add("Hello");
		l.add(10);
		l.add(12.3f);
		l.add(150.36);
		l.add('c');
		l.add(true);
		
		System.out.println(l);
		
		List v=new ArrayList<>();
		v.add(l.remove(3));
		v.add(l.remove(1));
		v.add("Hey");
		
		System.out.println(v);
	}
}
