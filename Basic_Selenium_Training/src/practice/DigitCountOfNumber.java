package practice;

import java.util.Scanner;

public class DigitCountOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number:");
		int num=sc.nextInt();
		int temp=num;
		int ct=0;
		while(temp!=0) {
			temp/=10;
			ct++;
		}
		System.out.println("Number of digits in "+num+" are "+ct);
	}
}
