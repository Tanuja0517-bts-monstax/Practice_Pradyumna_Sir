package number;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number:");
		int num = sc.nextInt();
		isStrongNum(num);
		
	}
	public static void isStrongNum(int num) {
		int temp=num;
		int fact=0;
		while(num>0) {
			int last=num%10;
			int f=1;
			for(int i=2;i<=last;i++) {
				f*=i;
			}
			
			fact=fact+f;
			num/=10;
		}
		if(fact==temp)
			System.out.println(temp+" is strong number");
		else
			System.out.println(temp+" is not strong number");
	}
}
