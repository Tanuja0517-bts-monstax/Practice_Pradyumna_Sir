package interview;

import java.util.Scanner;

public class Patter1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size:");
		int size=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				if((i+j)%2==0)
					System.out.print("-"+" ");
				else
					System.out.print("@"+" ");
			}
			System.out.println();
		}
	}
}
