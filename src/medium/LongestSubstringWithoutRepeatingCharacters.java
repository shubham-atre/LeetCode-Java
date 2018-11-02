package medium;

import java.util.HashMap;

/**
 * Author:
 * Shubham Atre
 * shubham.atre94@gmail.com
 * https://github.com/shubham-atre
 * https://leetcode.com/shubhamastu/
 * https://linkedin.com/in/shubhamastu/
 * <p>
 * <p>
 * -------------------------------------------------------
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
 * -------------------------------------------------------
 Given a string, find the length of the longest substring without repeating characters.

 Example 1:

 Input: "abcabcbb"
 Output: 3
 Explanation: The answer is "abc", with the length of 3.
 Example 2:

 Input: "bbbbb"
 Output: 1
 Explanation: The answer is "b", with the length of 1.
 Example 3:

 Input: "pwwkew"
 Output: 3
 Explanation: The answer is "wke", with the length of 3.
 Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int length = 0;
        int tempLen = 0;
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        for(int i=0; i<s.length();i++)
        {
            if(!map.containsKey(s.substring(i,i+1)))
            {
                map.put(s.substring(i,i+1), i);
                tempLen++;
            }
            else{

                tempLen = i - map.get(s.substring(i,i+1));
                int indexOfRepeat = map.get(s.substring(i,i+1));
                map.clear();
                for(int j= indexOfRepeat+1; j<i;j++)
                {
                    map.put(s.substring(j,j+1), j);
                }
                map.put(s.substring(i,i+1), i);
            }

            length = (length<tempLen)?tempLen:length;

        }
        return length;
    }
}
