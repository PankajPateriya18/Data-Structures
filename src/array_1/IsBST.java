package array_1;

import java.util.Scanner;

/*Given the root of a binary tree. Check whether it is a BST or not.
Note: We are considering that BSTs can not contain duplicate Nodes.
A BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
 

Example 1:

Input:
   2
 /    \
1      3
Output: 1 
Explanation: 
The left subtree of root node contains node
with key lesser than the root nodes key and 
the right subtree of root node contains node 
with key greater than the root nodes key.
Hence, the tree is a BST.    BST means Binary Search Tree
Example 2:

Input:
  2
   \
    7
     \
      6
       \
        5
         \
          9
           \
            2
             \
              6
Output: 0 
Explanation: 
Since the node with value 7 has right subtree 
nodes with keys less than 7, this is not a BST.
Your Task:
You don't need to read input or print anything. Your task is to complete 
the function isBST() which takes the root of the tree as a parameter and 
returns true if the given binary tree is BST, else returns false. 
*/
public class IsBST {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Size of Binary Tree : ");

		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter " + (i + 1) + " element : ");
			arr[i] = sc.nextInt();
		}
		
		boolean isBinary = isBinaryTree(arr);
		
		if(isBinary == true) System.out.println("\nTree is a binary Tree");
		else System.out.println("\nTree is not a binary Tree");

		sc.close();
	}

	static boolean isBinaryTree(int[] arr) {
		int isBinary = 1;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1])
				isBinary = 0;
		}
		
		if(isBinary == 1) return true;
		else return false;
	}

}
