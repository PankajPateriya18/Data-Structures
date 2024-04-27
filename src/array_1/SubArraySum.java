package array_1;
/*Example 1:

Input:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output: 2 4
Explanation: The sum of elements 
from 2nd position to 4th position 
is 12.
Example 2:

Input:
N = 10, S = 15
A[] = {1,2,3,4,5,6,7,8,9,10}
Output: 1 5
Explanation: The sum of elements 
from 1st position to 5th position
is 15.
 * 
 * */

import java.util.Scanner;

public class SubArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Size of Array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++) {
			System.out.print("Enter " + i + " element : " );
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Enter final Sum : ");
		int sum = sc.nextInt();
		
		int vSum=0;
		int first_Position=0, end_Position=0;
		for(int i=0; i<arr.length; i++) {
			vSum=0;
			first_Position = i+1;
			for(int j=i; j<arr.length; j++) {
				vSum = vSum + arr[j];
				if(vSum == sum) {
					end_Position = j+1;
					break;
				}
			}
			if(vSum == sum) {
				break;
			}
		}
		System.out.println("First Position : " + first_Position);
		System.out.println("Last Position : " + end_Position);
		sc.close();
	}
}






















