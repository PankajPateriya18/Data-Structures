package array_2;

import java.util.Scanner;

/*Given a string s and a dictionary of strings wordDict, return true 
if s can be segmented into a space-separated sequence of one or more 
dictionary words.

Note that the same word in the dictionary may be reused multiple times 
in the segmentation.

Example 1:

Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".

Example 2:

Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.

Example 3:

Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false*/
public class Word_Break {

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
						String temp2 = input.substring(i, tempLen+i);
						if(temp.equals(temp2)) {
							count++;
							i += temp.length()-1;
						}
					}
				}
			}
			
			if(count == total || count > total) System.out.println("All Word-Dicts are avaiable in String");
			else System.out.println("Only " +count +" word are matching out of " + total);
		}
	}
}
