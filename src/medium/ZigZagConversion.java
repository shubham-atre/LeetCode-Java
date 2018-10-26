package medium;

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
 * https://leetcode.com/problems/zigzag-conversion/description/
 * -------------------------------------------------------
 The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

 P   A   H   N
 A P L S I I G
 Y   I   R
 And then read line by line: "PAHNAPLSIIGYIR"

 Write the code that will take a string and make this conversion given a number of rows:

 string convert(string s, int numRows);
 Example 1:

 Input: s = "PAYPALISHIRING", numRows = 3
 Output: "PAHNAPLSIIGYIR"
 Example 2:

 Input: s = "PAYPALISHIRING", numRows = 4
 Output: "PINALSIGYAHRPI"
 Explanation:

 P     I    N
 A   L S  I G
 Y A   H R
 P     I
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {

        String res = "";
        char[] c = s.toCharArray();

        if(c.length<=numRows || numRows==1)
        {
            return s;
        }

        int i =0;
        while(i<c.length)
        {
            res=res+c[i];
            i=i+2*(numRows-1);
        }

        for(int row=1; row<numRows-1;row++)
        {
            res = res+ c[row];
            i = row + 2*(numRows-(row+1));

            while(i<c.length)
            {
                res=res+c[i];

                i=i+2*row;
                if(i<c.length)
                {
                    res=res+c[i];
                }

                i = i + 2*(numRows-(row+1));
            }
        }

        i =numRows-1;
        while(i<c.length)
        {
            res=res+c[i];
            i=i+2*(numRows-1);
        }

        return res;
    }
}
