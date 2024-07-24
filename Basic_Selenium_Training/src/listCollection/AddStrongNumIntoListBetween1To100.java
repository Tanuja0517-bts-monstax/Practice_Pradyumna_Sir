package listCollection;

import java.util.ArrayList;

public class AddStrongNumIntoListBetween1To100 {
	public static boolean isStrong(int num) {
		int temp=num;
		int prod=0;
		while(num>0) {
			int rem=num%10;
			int val=1;
			for(int i=1;i<=rem;i++) {
				val*=i;
			}
			num/=10;
			prod+=val;
		}
		if(temp==prod)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		int num=1;
		ArrayList<Integer> al=new ArrayList<>();
		while(num<100) {
			if(isStrong(num))
				al.add(num);
			num++;
		}
		System.out.println("All the Strong numbers between 1 to 100 are:"+al);
	}
}
