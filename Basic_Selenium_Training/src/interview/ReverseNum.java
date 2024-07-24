package interview;

import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int num=sc.nextInt();
		int rev=0;
		System.out.println("Actual Num:"+num);
		while(num>0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}
		System.out.println("Reversed num:"+rev);
	}
}
