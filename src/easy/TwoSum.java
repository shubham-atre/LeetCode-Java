package easy;

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
