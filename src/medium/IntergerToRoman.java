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
 * https://leetcode.com/problems/integer-to-roman/description/
 * -------------------------------------------------------
 Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

 Symbol       Value
 I             1
 V             5
 X             10
 L             50
 C             100
 D             500
 M             1000
 For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.

 Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

 I can be placed before V (5) and X (10) to make 4 and 9.
 X can be placed before L (50) and C (100) to make 40 and 90.
 C can be placed before D (500) and M (1000) to make 400 and 900.
 Given an integer, convert it to a roman numeral. Input is guaranteed to be within the range from 1 to 3999.
 */
public class IntergerToRoman {
    public String intToRoman(int num) {
        String c[] = {"I","V","X","L","C","D","M"};
        int v[] = {1,5,10,50,100,500,1000};

        String res ="";

        for(int i=6; i>=0;i--)
        {
            int div = num/v[i];
            if(div>0)
            {
                for(int j=0;j<div;j++)
                {
                    res = res + c[i];
                    num = num - v[i];
                }
                if(num<=0)
                    return res;
            }


            if(num>=900 && num<=999)
            {
                res = res + "CM";
                num = num - 900;
                if(num<=0)
                    return res;
            }
            if(num>=400 && num<=499)
            {
                res= res + "CD";
                num = num - 400;
                if(num<=0)
                    return res;
            }
            if(num>=90 && num<=99)
            {
                res = res + "XC";
                num = num - 90;
                if(num<=0)
                    return res;
            }
            if(num>=40 && num<=49)
            {
                res= res + "XL";
                num = num - 40;
                if(num<=0)
                    return res;
            }
            if(num==4)
            {
                res = res + "IV";
                return res;
            }
            if(num==9)
            {
                res = res + "IX";
                return res;
            }
        }

        return res;
    }
}
