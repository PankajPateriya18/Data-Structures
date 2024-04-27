package array_1;

import java.util.Scanner;

/*Given an array of integers. Find the Inversion Count in the array. 

Inversion Count: For an array, inversion count indicates how far (or close) 
the array is from being sorted. If the array is already sorted then the inversion 
count is 0.
If an array is sorted in the reverse order then the inversion count is the maximum. 
Formally, two elements a[i] and a[j] form an inversion if a[i] > a[j] and i < j.
 

Example 1:

Input: N = 5, arr[] = {2, 4, 1, 3, 5}
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 
has three inversions (2, 1), (4, 1), (4, 3).
Example 2:

Input: N = 5
arr[] = {2, 3, 4, 5, 6}
Output: 0
Explanation: As the sequence is already 
sorted so there is no inversion count.
Example 3:

Input: N = 3, arr[] = {10, 10, 10}
Output: 0
Explanation: As all the elements of array 
are same, so there is no inversion count.
Your Task:

You don't need to read input or print anything.
Your task is to complete the function inversionCount() which takes the array 
arr[] and the size of the array as inputs and returns the inversion count of 
the given array.
*/
public class inversionCount {

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
		
		int count=0;
		System.out.print("Inversion Elements are : " );
		for(i=0; i<arr.length; i++) {
			for(j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					count++;
					System.out.print("(" + arr[i] +"," + arr[j] + ") ");
				}
			}
		}
		System.out.println("\nTotal Inversion Elements are : " + count);
	}
}
