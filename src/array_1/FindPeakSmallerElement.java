package array_1;
/*Given an array arr of n elements that is first strictly increasing and 
 * then maybe strictly decreasing, find the maximum element in the array.

Note: If the array is increasing then just print the last element will be 
the maximum value.

Example:

Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less 
than 20.

Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 or 90
Explanation: The element 20 has neighbors 10 and 15, both of them are less 
than 20, similarly 90 has neighbors 23 and 67.

The following corner cases give a better idea about the problem. 

If the input array is sorted in a strictly increasing order, the last element 
is always a peak element. For example, 50 is peak element in {10, 20, 30, 40, 50}.
If the input array is sorted in a strictly decreasing order, the first element 
is always a peak element. 100 is the peak element in {100, 80, 60, 50, 20}.
If all elements of the input array are the same, every element is a peak element.
It is clear from the above examples that there is always a peak element in the 
input array.*/

import java.util.Scanner;

public class FindPeakSmallerElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		int i = 0, j;
		for (i = 0; i < arr.length; i++) {
			System.out.print("Enter " + (i + 1) + " element : ");
			arr[i] = sc.nextInt();
		}

		int findIncresingOrder = 1;
		int findDecresingOrder = 1;
		int findAllSome = 1;

		for (i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1])
				findIncresingOrder = 0;
		}
		for (i = 1; i < arr.length; i++) {
			if (arr[i - 1] < arr[i])
				findDecresingOrder = 0;
		}
		for (i = 1; i < arr.length - 1; i++) {
			if (arr[i - 1] != arr[i] || arr[i] != arr[i + 1])
				findAllSome = 0;
		}
		if (findAllSome == 1) {
			System.out.print("\nPeak Smaller Elements are : ");
			for (i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} else {
			
			if (findDecresingOrder == 1)
				System.out.print("\nPeak Smaller Element is : " + arr[0] + " ");
			else if (findIncresingOrder == 1)
				System.out.print("\nPeak Smaller Element is : " +arr[arr.length - 1]);
			else {
				System.out.print("\nPeak Smaller Elements are : ");
				for (i = 1; i < arr.length - 1; i++) {
					if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1])
						System.out.print(arr[i] + " ");
				}
			}

		}
	}
}
