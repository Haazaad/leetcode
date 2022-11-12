package ru.haazad.test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void twoSumTest() {
        compareTwoArray(new int[]{0, 1}, Solution.twoSum(new int[]{2,7,11,15}, 9));
        compareTwoArray(new int[]{0, 1}, Solution.twoSum(new int[]{3, 3}, 6));
        compareTwoArray(new int[]{1, 2}, Solution.twoSum(new int[]{3,2,4}, 6));
        compareTwoArray(new int[]{0, 2}, Solution.twoSum(new int[]{3,2,3}, 6));
        compareTwoArray(new int[]{1, 2}, Solution.twoSum(new int[]{2,5,5,11}, 10));
    }

    private void compareTwoArray(int[] first, int[] second) {
        for (int i =0; i < first.length; i++) {
            Assertions.assertEquals(first[i], second[i], "Not equals");
        }
    }

    @Test
    void isPalindrome() {
        Assertions.assertTrue(Solution.isPalindrome(121));
        Assertions.assertFalse(Solution.isPalindrome(-121));
        Assertions.assertFalse(Solution.isPalindrome(10));
        Assertions.assertTrue(Solution.isPalindrome(1221));
    }

    @Test
    void longestCommonPrefix() {
        Assertions.assertEquals("fl", Solution.longestCommonPrefix(new String[]{"flower","flow","flight"}));
        Assertions.assertEquals("", Solution.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        Assertions.assertEquals("c", Solution.longestCommonPrefix(new String[]{"cir","car"}));
    }
}