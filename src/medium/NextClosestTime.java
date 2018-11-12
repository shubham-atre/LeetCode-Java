package medium;

import java.util.Arrays;

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
 * https://leetcode.com/problems/next-closest-time/description/
 * -------------------------------------------------------
 Given a time represented in the format "HH:MM", form the next closest time by reusing the current digits. There is no limit on how many times a digit can be reused.

 You may assume the given input string is always valid. For example, "01:34", "12:09" are all valid. "1:34", "12:9" are all invalid.

 Example 1:

 Input: "19:34"
 Output: "19:39"
 Explanation: The next closest time choosing from digits 1, 9, 3, 4, is 19:39, which occurs 5 minutes later.  It is not 19:33, because this occurs 23 hours and 59 minutes later.
 Example 2:

 Input: "23:59"
 Output: "22:22"
 Explanation: The next closest time choosing from digits 2, 3, 5, 9, is 22:22. It may be assumed that the returned time is next day's time since it is smaller than the input time numerically.
 */
public class NextClosestTime {
    public String nextClosestTime(String time) {

        char[] res = time.toCharArray();

        char[] ch = time.toCharArray();

        int[] dig = {ch[0]-'0',ch[1]-'0',ch[3]-'0', ch[4]-'0'};

        int[] sorted = {ch[0]-'0',ch[1]-'0',ch[3]-'0', ch[4]-'0'};

        Arrays.sort(sorted);
        for(int s:sorted)
        {
            for(int s1:sorted)
            {
                if((s*10+s1 > dig[2]*10+dig[3]) && (s*10+s1 < 60))
                {
                    res[3]=(char)(s+'0');
                    res[4]=(char)(s1+'0');
                    return new String(res);
                }
            }

        }

        if(dig[0]*10+dig[1] !=23 && sorted[3]!=dig[1])
        {
            int next = 0;
            while(next<3 && sorted[next]<=dig[1])
                next++;

            res[1]=(char) (sorted[next]+'0');
            res[3]=(char) (sorted[0]+'0');
            res[4]=(char) (sorted[0]+'0');
        }
        else
        {
            res[0]=(char) (sorted[0]+'0');
            res[1]=(char) (sorted[0]+'0');
            res[3]=(char) (sorted[0]+'0');
            res[4]=(char) (sorted[0]+'0');
        }



        return new String(res);

    }
}
