package RecursionSubsetsAndStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class WordBreak {
	public static void main(String[] args) {
//		String s = "applepenapple";
//		List<String> li = new ArrayList<String>();
//		li.add("apple");
//		li.add("pen");
		String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab";
		List<String> li = Arrays.asList(new String[] {"a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"});
//		System.out.println("Five"+wordBreak(s,li));
//		System.out.println(wordBreak(s,li));
		System.out.println(wordBreak(s,li));
	}
	
	/*
	 * Pseudo Code
	 * get the first letter of string s and check its available in list (uing start =0, and increase the end)
	 * check until you find the word starting from i - available in the list
	 * If yes - return true
	 * 			start to check the remaining letters from string
	 * If No, increase the start point to i and continue the checking until start == length
	 * 
	 */

	private static boolean wordBreak(String s, List<String> li) {
		return wordReturn(0,s,li);
	}
	
	public static boolean wordReturn(int start, String s, List<String> li) {
		
		if(start==s.length()) return true;
		
		for (int i = start+1; i <= s.length(); i++) {
			String dumm = s.substring(start, i);
			if(li.contains(s.substring(start, i)) 
					&& wordReturn(i, s, li))
			{
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean wordBreakSet(String s, List<String> wordDict) {
        Set<String> set=new HashSet<>(wordDict);
        int maxLength=0;
        
        for(String word:wordDict){
            maxLength=Math.max(maxLength,word.length());
        }
    
        boolean[] dp=new boolean[s.length()+1];
        dp[0]=true;
        
        for(int i=0;i<s.length();i++){
            int j=i;
            while(j>=0 && j>i-maxLength){
                if(set.contains(s.substring(j,i+1)) && dp[j]){
                    dp[i+1]=true;
                }
                j--;
            }
        }
        
        return dp[s.length()];
    }
	
}
