package ru.haazad.test;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void twoSumTest_1() {
        compareTwoArray(new int[]{0, 1}, Solution.twoSum(new int[]{2,7,11,15}, 9));
    }

    @Test
    void twoSumTest_2() {
        compareTwoArray(new int[]{0, 1}, Solution.twoSum(new int[]{3, 3}, 6));
    }

    @Test
    void twoSumTest_3() {
        compareTwoArray(new int[]{1, 2}, Solution.twoSum(new int[]{3,2,4}, 6));
    }

    @Test
    void twoSumTest_4() {
        compareTwoArray(new int[]{0, 2}, Solution.twoSum(new int[]{3,2,3}, 6));
    }

    @Test
    void twoSumTest_5() {
        compareTwoArray(new int[]{1, 2}, Solution.twoSum(new int[]{2,5,5,11}, 10));
    }

    private void compareTwoArray(int[] first, int[] second) {
        for (int i =0; i < first.length; i++) {
            Assertions.assertEquals(first[i], second[i], "Not equals");
        }
    }

    @Test
    void isPalindrome_1() {
        int x = 121;
        Assertions.assertTrue(Solution.isPalindrome(x));
    }

    @Test
    void isPalindrome_2() {
        int x = -121;
        Assertions.assertFalse(Solution.isPalindrome(x));
    }

    @Test
    void isPalindrome_3() {
        int x = 10;
        Assertions.assertFalse(Solution.isPalindrome(x));
    }

    @Test
    void isPalindrome_4() {
        int x = 1221;
        Assertions.assertTrue(Solution.isPalindrome(x));
    }
}