package array_2;

import java.util.Scanner;

/*Example 1:

Input: 
board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], 
word = "ABCCED"
Output: true
Example 2:


Input: 
board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], 
word = "SEE"
Output: true
Example 3:


Input: 
board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], 
word = "ABCB"
Output: false
 */
public class Word_Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 2D Array Total Rows : ");
		int tRow = sc.nextInt();

		System.out.print("\nEnter 2D Array Total Columns : ");
		int tCol = sc.nextInt();
		
		char[][] board = new char[tRow][tCol];
		
		for(int i=0; i<board.length; i++) {
			System.out.println("\nEnter " + (i+1) + " Rows Element\n");
			for(int j=0; j<board[i].length; j++) {
				System.out.print("Enter " + (i+1)+" row and "+(j+1)+" column element : ");
				board[i][j] = sc.next().charAt(0);
			}
		}
		for(int i=0; i<board.length; i++) {
			if(i == 0)System.out.println("\nYour Matrix is : \n");
			for(int j=0; j<board[i].length; j++) {
				System.out.print("        " + board[i][j]);
			}
			System.out.println();
		}
		
		System.out.print("Enter Word : ");
		String word = sc.next();
		
		int prove = 1;
		for(int k=0; k<word.length(); k++) {
			char temp = word.charAt(k);
			int getCount = 0;
			for(int i=0; i<board.length; i++) {
				for(int j=0; j<board[i].length; j++) {
					if(board[i][j] == '1') {
						
					}
					else {
						char temp2 = board[i][j];
						if(temp == temp2) {
							getCount = 1;
							board[i][j] = '1';
							break;
						}
					}
				}
				if(getCount == 1) break;
				
			}
			if(getCount == 0) {
				prove = 0;
				break;
			}
		}
		
		for(int i=0; i<board.length; i++) {
			if(i == 0)System.out.println("\nYour Matrix After Operation : \n");
			for(int j=0; j<board[i].length; j++) {
				System.out.print("        " + board[i][j]);
			}
			System.out.println();
		}
		
		if(prove == 1) { 
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		sc.close();
	}	
}
