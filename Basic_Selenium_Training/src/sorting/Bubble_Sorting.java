package sorting;

/*Bubble Sort
Bubble sort is a sorting algorithm that compares two adjacent elements and swaps them until they are in the intended order.

Just like the movement of air bubbles in the water that rise up to the surface, 
each element of the array move to the end in each iteration. Therefore, it is called 
a bubble sort.*/
public class Bubble_Sorting {
	public static void main(String[] args) {
		int arr[] = { 3, 5, -2, 0, 12, 0, -10, -18, 19 };
		System.out.println("********************* Before Sorting *********************");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int arr1[] =bubbleSorting(arr);
		System.out.println("********************* After sorting *********************");
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
	}

	public static int[] bubbleSorting(int arr[]) {
		// sorting logic
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
