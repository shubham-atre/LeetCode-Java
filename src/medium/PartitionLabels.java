package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * https://leetcode.com/problems/partition-labels/description/
 * -------------------------------------------------------
 A string S of lowercase letters is given. We want to partition this string into as many parts as possible so that each letter appears in at most one part, and return a list of integers representing the size of these parts.

 Example 1:
 Input: S = "ababcbacadefegdehijhklij"
 Output: [9,7,8]
 Explanation:
 The partition is "ababcbaca", "defegde", "hijhklij".
 This is a partition so that each letter appears in at most one part.
 A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits S into less parts.
 Note:

 S will have length in range [1, 500].
 S will consist of lowercase letters ('a' to 'z') only.
 */
public class PartitionLabels {
    class Solution {
        public List<Integer> partitionLabels(String S) {

            char[] ch = S.toCharArray();

            Map<Character,Integer> count = new HashMap<Character,Integer>();

            Map<Character,Integer> visited = new HashMap<Character,Integer>();

            List<Integer> res = new ArrayList<Integer>();

            for(char c:ch)
            {
                if(count.containsKey(c))
                {
                    count.replace(c,count.get(c)+1);
                }
                else
                {
                    count.put(c,1);
                }
            }


            for(char c:ch)
            {
                if(visited.isEmpty())
                {
                    res.add(new Integer(count.get(c)));
                    if(count.get(c)-1 != 0)
                        visited.put(c,count.get(c)-1);
                    count.remove(c);
                }
                else
                {
                    if(visited.containsKey(c))
                    {
                        if(visited.get(c)-1 == 0)
                            visited.remove(c);
                        else
                            visited.replace(c,visited.get(c)-1);
                    }
                    else
                    {
                        res.set(res.size()-1,res.get(res.size()-1)+count.get(c));
                        if(count.get(c)-1 != 0)
                            visited.put(c,count.get(c)-1);
                        count.remove(c);
                    }
                }
            }

            return res;

        }
    }
}
