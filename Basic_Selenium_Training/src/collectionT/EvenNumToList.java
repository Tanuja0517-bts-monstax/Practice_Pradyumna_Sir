package collectionT;

import java.util.ArrayList;

public class EvenNumToList {
	public static void main(String[] args) {
		int num=1;
		ArrayList<Integer> al=new ArrayList<>();
		while(num<100) {
			if(num%2==0)
				al.add(num);
			num++;
		}
		System.out.println("List of even digits between 1 to 100:"+al);
	}
}
