package array_1;
/*Example 1:

Input: 
N = 6
Arr[] = {12, 35, 1, 10, 34, 1}
Output: 34
Explanation: The largest element of the 
array is 35 and the second largest element
is 34.
Example 2:

Input: 
N = 3
Arr[] = {10, 5, 10}
Output: 5
Explanation: The largest element of 
the array is 10 and the second 
largest element is 5.
Your Task:
You don't need to read input or print anything. Your task is to 
complete the function print2largest() which takes the array of 
integers arr and n as parameters and returns an integer denoting 
the answer. If 2nd largest element doesn't exist then return -1.
 * */

import java.util.Scanner;

public class secondLargest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		int i=0;
		for(i=0; i<arr.length; i++) {
			System.out.print("Enter " + (i+1) + " element : ");
			arr[i] = sc.nextInt();
		}
		
		int max=0;
		int secMax = 0;
		for(i=0; i<arr.length; i++) {
			if(max < arr[i]) max = arr[i];
			
			if(secMax < max & secMax < arr[i] && max != arr[i]) secMax = arr[i];
		}
		System.out.println("Maximum element is : " + max);
		System.out.println("Second Maximum element is : " + secMax);
		
		sc.next();
	}
}
