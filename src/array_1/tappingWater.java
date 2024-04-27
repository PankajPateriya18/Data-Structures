package array_1;

import java.util.Scanner;

/*Given an array arr[] of N non-negative integers representing the 
 * height of blocks. If width of each block is 1, compute how much 
 * water can be trapped between the blocks during the rainy season. 
 

Example 1:

Input:
N = 6
arr[] = {3,0,0,2,0,4}
Output:
10
Explanation: 

Example 2:

Input:
N = 4
arr[] = {7,4,0,9}
Output:
10
Explanation:
Water trapped by above 
block of height 4 is 3 units and above 
block of height 0 is 7 units. So, the 
total unit of water trapped is 10 units.
Example 3:

Input:
N = 3
arr[] = {6,9,9}
Output:
0
Explanation:
No water will be trapped.

Your Task:
You don't need to read input or print anything. The task is to complete the 
function trappingWater() which takes arr[] and N as input parameters and returns 
the total amount of water that can be trapped.
*/
public class tappingWater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Horizontal space in blocks : ");
		int horizontalSpace = sc.nextInt();
		
		int[] verticalSpaces = new int[horizontalSpace];
		int i=0;
		for(i=0; i<verticalSpaces.length; i++) {
			System.out.print("Enter " + (i+1) + " block height : ");
			verticalSpaces[i] = sc.nextInt();
		}
		
		int maxHeight = 0;
		int positionMaxHeight = 0;
		int secondMaxHeight = 0;
		int positionSecondMaxHeight = 0;
		
		for(i=0; i<verticalSpaces.length; i++) {
			if(maxHeight < verticalSpaces[i]) {
				maxHeight = verticalSpaces[i];
				positionMaxHeight = i;
			}
		}
//		System.out.println("Max Height : " + maxHeight + "\nPosition : " + (positionMaxHeight+1));
		for(i=0; i<verticalSpaces.length; i++) {
			if(secondMaxHeight < verticalSpaces[i] && secondMaxHeight < maxHeight && maxHeight != verticalSpaces[i]) {
				secondMaxHeight = verticalSpaces[i];
				positionSecondMaxHeight = i;
			}

		}
//		System.out.println("Second Max Height : " + secondMaxHeight + "\nPosition : " + (positionSecondMaxHeight+1));
		int countWaterTap = 0;
		if(positionMaxHeight < positionSecondMaxHeight) {
			for(i = positionMaxHeight+1; i<positionSecondMaxHeight; i++) {
				countWaterTap += secondMaxHeight - verticalSpaces[i];
//				System.out.println("H");
			}
		}
		else if(positionMaxHeight > positionSecondMaxHeight) {
			for(i = positionSecondMaxHeight+1; i< positionMaxHeight; i++) {
				countWaterTap += secondMaxHeight - verticalSpaces[i];
//				System.out.println("H");
			}
		}
		if(countWaterTap == 0) {
			System.out.println("\n\nNo Water will be Tapped");
		}
		else 
			System.out.println("\n\nCount of Water Tap : " + countWaterTap);
		
		
		
	}
}




























