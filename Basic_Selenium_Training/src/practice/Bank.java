package practice;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name:");
		String name=sc.nextLine();
		System.out.print("Enter address:");
		sc.nextLine();
		String address=sc.nextLine();
		System.out.print("Enter acc number:");
		long accno=sc.nextLong();
		System.out.print("Enter mobile number:");
		long mno=sc.nextLong();
		System.out.print("Enter initial balance:");
		double bal=sc.nextDouble();
		System.out.print("ENter pin:");
		int pin=sc.nextInt();
		System.out.print("Enter branch name:");
		String branch=sc.nextLine();
		System.out.print("Enter bank name:");
		sc.nextLine();
		String bname=sc.nextLine();
		System.out.print("Enter ifsc code:");
		long ifsc=sc.nextLong();
		
		BankAcc ac=new BankAcc(name, address, accno, mno, bal, pin, branch, bname, ifsc);
		System.out.println("Actual balance:"+ac.getBalance(1234));
		ac.credit(500);
		System.out.println("After creddeting amount:"+ac.getBalance(1234));
	}
}
