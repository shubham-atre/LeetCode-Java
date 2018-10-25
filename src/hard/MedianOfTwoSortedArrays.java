package hard;

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
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 * -------------------------------------------------------
 There are two sorted arrays nums1 and nums2 of size m and n respectively.

 Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

 You may assume nums1 and nums2 cannot be both empty.

 Example 1:

 nums1 = [1, 3]
 nums2 = [2]

 The median is 2.0
 Example 2:

 nums1 = [1, 2]
 nums2 = [3, 4]

 The median is (2 + 3)/2 = 2.5
 */
public class MedianOfTwoSortedArrays {

    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int totalLength = nums1.length + nums2.length;
            int target = totalLength/2;

            boolean even = totalLength % 2 == 0;
            int result = 0, previous = 0;

            for(int i = 0, j = 0, count = 0; count <= target; count++) {
                previous = result;
                if(i >= nums1.length) result = nums2[j++];
                else if(j >= nums2.length) result = nums1[i++];
                else if(nums1[i] < nums2[j]) result = nums1[i++];
                else result = nums2[j++];

            }

            if(even)
                return (double) (previous + result)/2;
            else return result;
        }
    }

}
