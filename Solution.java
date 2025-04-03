// problem link: https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// sort the array and then use 2 pointers to compare the difference, appened pointer
//according to conditions below.

import java.util.Arrays;

public class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = 1;
        int result = 0;

        while (left < nums.length && right < nums.length) {
            if (left == right || nums[right] - nums[left] < k) {
                right++;      
            } else if (nums[right] - nums[left] > k) {
                left++;       
            } else {
                left++;
                result++;
                while (left < nums.length && nums[left] == nums[left - 1])
                    left++;
            }
        }
        return result;
    }
}
