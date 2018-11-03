package easy;

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
 * https://leetcode.com/problems/longest-common-prefix/description/
 * -------------------------------------------------------
 Write a function to find the longest common prefix string amongst an array of strings.

 If there is no common prefix, return an empty string "".

 Example 1:

 Input: ["flower","flow","flight"]
 Output: "fl"
 Example 2:

 Input: ["dog","racecar","car"]
 Output: ""
 Explanation: There is no common prefix among the input strings.
 Note:

 All given inputs are in lowercase letters a-z.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        String pre = "";

        if(strs==null || strs.length<1)
            return pre;

        for(int i=0; i<strs.length; i++)
        {
            if(strs[i]==null || strs[i].length()<1)
                return pre;
        }

        boolean more =true;
        boolean allstrings =true;
        char temp;

        for(int i=0; more; i++)
        {
            temp = strs[0].charAt(i);

            for(int j=0; j<strs.length; j++)
            {
                if(!(temp==strs[j].charAt(i)))
                {
                    allstrings = false;
                }
                if(!(i<strs[j].length()-1))
                {
                    more = false;
                }
            }

            if(allstrings==true)
            {
                pre = strs[0].substring(0,i+1);
            }
        }

        return pre;
    }
}
