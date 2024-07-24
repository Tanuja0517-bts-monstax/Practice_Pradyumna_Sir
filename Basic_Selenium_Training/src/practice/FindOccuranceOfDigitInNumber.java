package practice;

import java.util.Scanner;

public class FindOccuranceOfDigitInNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		System.out.print("Enter the digit whose occurance to check:");
		int digit=sc.nextInt();
		int ct=0;
		int temp=num;
		while(temp!=0) {
			int rem=temp%10;
			if(rem==digit)
				ct++;
			temp/=10;
		}
		if(ct==0)
			System.out.println("Digit not present in number");
		System.out.println("The occurance of "+digit+" in "+num+" is "+ct);
	}
}
