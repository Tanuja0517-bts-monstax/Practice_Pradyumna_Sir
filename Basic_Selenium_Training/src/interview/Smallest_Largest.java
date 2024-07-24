package interview;

import java.util.Scanner;

public class Smallest_Largest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int arr[]=new int[sc.nextInt()];
		
		System.out.print("Enter elements in array:");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
		int smallest=arr[0],largest=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest)
				smallest=arr[i];
			if(arr[i]>largest)
				largest=arr[i];
		}
		
		System.out.println("Smallest:"+smallest);
		System.out.println("Largest:"+largest);
	}
}
