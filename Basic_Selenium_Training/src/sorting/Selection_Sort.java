package sorting;
/*
 * Selection Sort Algorithm
Selection sort is a sorting algorithm that selects the smallest element from an 
unsorted list in each iteration and places that element at the beginning of the 
unsorted list.*/
public class Selection_Sort {
	public static void main(String[] args) {
		int arr[]= {12,3,4,-9,0,14,1,5};
		System.out.println("********************* Before Sorting *********************");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int arr1[]=selectionSorting(arr);
		System.out.println("********************* After sorting *********************");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}
	
	public static int[] selectionSorting(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int val=i;
			for(int j=i+1;j<arr.length;j++) {
				if(val>arr[j]) {
					int temp=arr[j];
					arr[j]=val;
					val=temp;
				}
			}
		}
		return arr;
	}
}
