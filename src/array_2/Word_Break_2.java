package array_2;

import java.util.Scanner;

/*Given a string s and a dictionary of strings wordDict, add spaces in s to construct a sentence where each word is a valid dictionary word. Return all such possible sentences in any order.

Note that the same word in the dictionary may be reused multiple times in the segmentation.

 

Example 1:

Input: s = "catsanddog", wordDict = ["cat","cats","and","sand","dog"]
Output: ["cats and dog","cat sand dog"]
Example 2:

Input: s = "pineapplepenapple", wordDict = ["apple","pen","applepen","pine","pineapple"]
Output: ["pine apple pen apple","pineapple pen apple","pine applepen apple"]
Explanation: Note that you are allowed to reuse a dictionary word.
Example 3:

Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: []
 */
public class Word_Break_2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Word : ");
			String input = sc.next().toLowerCase();
			
			System.out.print("Total Word Dict : ");
			int total = sc.nextInt();
			
			int i=0, j=0, count=0;
			String[] arr = new String[total];
			
			for(i=0; i<total; i++) {
				System.out.print("Enter " +(i+1) + " Word-Dict : ");
				arr[i] = sc.next().toLowerCase();
			}
			String temp;
			for(j=0; j<total; j++) {
				temp = arr[j];
				for(i=0; i<input.length(); i++) {
					if(temp.charAt(0) == input.charAt(i)) {
						int tempLen = temp.length();
						try {
							String temp2 = input.substring(i, tempLen+i);
							if(temp.equals(temp2)) {
								count++;
								i += temp.length()-1;
							}
						}catch(Exception e) {}
					}
				}
			}
			
			if(count == total || count > total) System.out.println("All Word-Dicts are avaiable in String");
			else System.out.println("Only " +count +" word are matching out of " + total);
		}
	}

}
