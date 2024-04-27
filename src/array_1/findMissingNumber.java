package array_1;
/*Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4

Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9
*/

import java.util.Scanner;

public class findMissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Size of Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter " + i + " element : ");
			arr[i] = sc.nextInt();
		}

		int fSum = 0;
		for(int j=size+1; j>0; j--) {
			fSum += j;
		}
		
		int aSum=0;
		for(int i=0; i<arr.length;i++) {
			aSum += arr[i];
		}
		System.out.println("Missing Element is : " + (fSum-aSum));

		sc.close();
	}
}
