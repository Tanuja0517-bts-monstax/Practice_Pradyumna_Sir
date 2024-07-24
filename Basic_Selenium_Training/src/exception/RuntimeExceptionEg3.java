package exception;

import java.util.Scanner;

public class RuntimeExceptionEg3 {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of array:");
		int arr[]=new int[sc.nextInt()];
		
		System.out.print("Enter elements in array:");
		for(int i=0;i<=arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
}
