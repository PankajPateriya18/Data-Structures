package array_1;
/*Given an array of integers Arr of size N and a number K. 
 * Return the maximum sum of a subarray of size K.

NOTE*: A subarray is a contiguous part of any given array.

Example 1:

Input:
N = 4, K = 2
Arr = [100, 200, 300, 400]
Output:
700
Explanation:
Arr3  + Arr4 =700,
which is maximum.
Example 2:

Input:
N = 4, K = 4
Arr = [100, 200, 300, 400]
Output:
1000
Explanation:
Arr1 + Arr2 + Arr3 + Arr4 =1000,
which is maximum.
Your Task:

You don't need to read input or print anything. 
Your task is to complete the function maximumSumSubarray() 
which takes the integer K, vector Arr with size N, containing 
the elements of the array and returns the maximum sum of a 
subarray of size K.*/

import java.util.Arrays;
import java.util.Scanner;

public class MaxSumSubArray {

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
		System.out.print("Enter How many Maximum sum : ");
		int k = sc.nextInt();
		Arrays.sort(arr);
		int sum = 0;
		int count =0 ;
		for(i=arr.length-1; i>=0; i--) {
			count++;
			sum += arr[i];
			if(count == k) break;
		}
		System.out.println("Maximum sum is : " + sum);
		sc.next();
	}
}


























