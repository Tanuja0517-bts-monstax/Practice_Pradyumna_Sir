//With try catch
package exception;

import java.util.Scanner;

public class RuntimeExceptionEg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size fo array:");
		int arr[]=new int[sc.nextInt()];
		
		System.out.print("Enter elements in array:");
		try {
			for(int i=1;i<=arr.length;i++) {
				arr[i]=sc.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException aiob) {
			System.out.println("Entering more data then array size😑");
			System.out.println("Exception handled:)");
		}
	}
}
