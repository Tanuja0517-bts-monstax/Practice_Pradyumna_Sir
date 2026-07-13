package EngineeringDigestCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class ArrayListImp {
	public static void main(String[] args) {
		// 1st way to create list
		List li = new ArrayList();
		li.add("Abc");
		li.add(true);
		li.add(1);
		li.add(12.34f);
		
		System.out.println("Size:"+li.size());
		System.out.println("Entire List:"+li);
		
		// 2nd way to create list
		List li1=Arrays.asList("Hi",true,1,12.3f);
		System.out.println(li1);
		
		//3rd way to create list
		String str[]= {"Apple","Banana","Mango","Cherry"};
		List<String> li2=Arrays.asList(str);
		System.out.println(li2);
		
		//4th way to create list
		List li3=Arrays.asList("Monday","Tuesday","Sunday");
		//li3.add("sunday");		It will give exception
		System.out.println(li3);
		
		//5th way to create list
		List<Integer> li4=List.of(1,2,3,4,5);
		System.out.println("Before:"+li4);
//		li4.set(2, 33);			It will give exception
//		System.out.println("After:"+li4);
	}
}
