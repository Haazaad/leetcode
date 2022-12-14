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

    public static boolean isPalindrome(int x) {
        if (x <= 0 || x % 10 == 0) {
            return false;
        }
        String arr = String.valueOf(x);
        for (int i = 0, j = arr.length() - 1; i < arr.length() && j >= 0; i++, j--) {
            if (arr.charAt(i) == arr.charAt(j)){
                continue;
            }
            return false;
        }
        return true;
    }

    public static String longestCommonPrefix(String[] strs) {
        String start = strs[0];

        for (String s: strs) {
            if (s.length() < start.length()) {
                start = s;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < start.length(); i++) {
            boolean isPresent = true;
            for (String str : strs) {
                if (str.equals(start)){
                    continue;
                }
                if (start.charAt(i) != str.charAt(i)) {
                    isPresent = false;
                    break;
                }
            }
            if (isPresent) {
                sb.append(start.charAt(i));
            } else {
                return sb.toString();
            }
        }
        return sb.toString();
    }
}
