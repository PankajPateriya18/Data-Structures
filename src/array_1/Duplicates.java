package array_1;

import java.util.Scanner;

/*Given an array a of size N which contains elements from 0 to N-1, 
 * you need to find all the elements occurring more than once in the 
 * given array. Return the answer in ascending order. If no such element 
 * is found, return list containing [-1]. 

Note: The extra space is only for the array to be returned. Try and perform 
all operations within the provided array. 

Example 1:

Input:
N = 4
a[] = {0,3,1,2}
Output: 
-1
Explanation: 
There is no repeating element in the array. Therefore output is -1.
Example 2:

Input:
N = 5
a[] = {2,3,1,2,3}
Output: 
2 3 
Explanation: 
2 and 3 occur more than once in the given array.
Your Task:
Complete the function duplicates() which takes array a[] and n as input as 
parameters and returns a list of elements that occur more than once in the 
given array in a sorted manner. */
public class Duplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Size of Array : ");
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter " + (i+1) + " element : ");
			arr[i] = sc.nextInt();
		}
		
		int duplicates = 0, temp;
		String dup = "";
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != -1) {
				for(int j=i+1; j<arr.length; j++) {
					if(arr[i] == arr[j]) {
						duplicates++;
						dup += arr[j] + " ";
						arr[j] = -1;
					}
				}
			}
		}
		if(duplicates == 0) System.out.println("\nThere is no dupicate");
		else System.out.println("\nDuplicates are : " + dup + "\n\nTotal Duplicates are " + duplicates);
		


	}

}
