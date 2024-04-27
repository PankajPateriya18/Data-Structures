package array_2;

import java.util.Scanner;

/*Given an integer array nums of unique elements, return all possible 
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]*/
public class Sub_Sets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Set Range : ");
		int range = sc.nextInt();
		
		int[] set = new int[range];
		System.out.println("Enter Set Values : ");
		for(int i =0 ;i<range; i++) {
			System.out.print("Enter " + (i+1) + " value : ");
			set[i] = sc.nextInt();
		}
		
		System.out.print("Your Set is : [");
		for(int i =0 ;i<range; i++) {
			System.out.print(" [" + set[i] + "]");
			if((i+1) != range) System.out.print(",");
			if((i+1) == set.length)System.out.println(" ]");
		}
		
//		System.out.print("Subsets are : [");
//		for(int i=0; i<range; i++) {
//			if(i == 0) System.out.print(" []");
//			System.out.print(" ["+ set[i] + "],");
//			for(int j=i;j<range; j++) {
//				int count = 1;
//				System.out.print(" [");
//				for(int k=j; k<count+j && k<range; k++) {
//					System.out.print(set[k]);
//				}
//
//				System.out.print("]");
//			}
//			
//		}
//		
		int n = set.length;
		System.out.println(1<<n);
		 
        // Run a loop for printing all 2^n
        // subsets one by one
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{ ");
 
            // Print current subset
            for (int j = 0; j < n; j++)
 
                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not  
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");
 
            System.out.println("}");
        }
		    
	}
}

