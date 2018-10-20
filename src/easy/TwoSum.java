package easy;
/**
 *
 Author:
 Shubham Atre
 shubham.atre94@gmail.com
 https://github.com/shubham-atre
 https://leetcode.com/shubhamastu/
 https://linkedin.com/in/shubhamastu/
 *
 *
 -------------------------------------------------------
 https://leetcode.com/problems/two-sum/description/
 -------------------------------------------------------

 Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:

 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].

 *
 */
public class TwoSum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {

            int[] result = new int[2];
            for(int i=0; i< (nums.length-1); i++)
            {
                for(int j=i; j<(nums.length-1); j++)
                {
                    if(nums[i]+nums[j+1]==target)
                    {
                        result[0] = i;
                        result[1] = j+1;
                        return result;
                    }
                }
            }

            return null;
        }
    }
}
