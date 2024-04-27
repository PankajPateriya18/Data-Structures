package array_1;

import java.util.Scanner;

/*Given an array Arr[] of N integers. 
 * Find the contiguous sub-array(containing at least one number) 
 * which has the maximum sum and return its sum.


Example 1:

Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
Example 2:

Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element (-1)

Your Task:
You don't need to read input or print anything. The task is to 
complete the function maxSubarraySum() which takes Arr[] and 
N as input parameters and returns the sum of subarray with maximum sum.
*/
public class MaxSubArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Size of Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter " + i + " element : ");
			arr[i] = sc.nextInt();
		}
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print("Sorted Array is : ");
		for(int i=0; i<arr.length; i++) {System.out.print(arr[i] + " ");}
	    sc.close();
	}
}





























