package practice;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number upto wich fibonacci you want:");
		int num=sc.nextInt();
		int num1=0;
		int num2=1;
		int num3=num1+num2;
		System.out.print(num1+" "+num2+" ");
		while(num2<num) {
			num3=num1+num2;
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
		}
	}
}
