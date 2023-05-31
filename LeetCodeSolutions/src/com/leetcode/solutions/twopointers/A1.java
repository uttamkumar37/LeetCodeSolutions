package com.leetcode.solutions.twopointers;

import java.util.HashMap;
import java.util.Map;

public class A1 {

	public static void main(String[] args) {
      //  https://leetcode.com/problems/two-sum/
		
		int [] arr = {1,2,3,4,5,6,7,8,9};
		int target =10;
		int ans[]=Solution.twoSum(arr, target);
		System.out.println("First index=" +ans[0]+"\n" + "Second index="+ ans[1] );
	}

}
class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (hm.containsKey(remainder)) {
                indices[0] = hm.get(remainder);
                indices[1] = i;
                return indices;
            }

            hm.put(nums[i], i);
        }

        return new int[] {};
    }
}
