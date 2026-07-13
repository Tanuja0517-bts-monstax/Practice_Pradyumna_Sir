package number;

import java.util.Scanner;

public class ArmStrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();
		
		isArmStrongNumber(num);
	}
	
	public static void isArmStrongNumber(int num) {
		int temp=num;
		int arms=0;
		while(num>0) {
			int last=num%10;
			int cube=1;
			cube=last*last*last;
			arms+=cube;
			num/=10;
		}
		if(arms==temp)
			System.out.println(temp+" is armstrong number");
		else
			System.out.println(temp+" is not armstrong number");
	}
}
