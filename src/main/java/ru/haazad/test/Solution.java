package ru.haazad.test;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int start = 0;
        while (start < nums.length) {
            for (int i = start + 1; i < nums.length; i++) {
                if (nums[start] + nums[i] == target) {
                    return new int[]{start, i};
                }
            }
            start++;
        }
        return null;
    }
}
