package com.day02.vowels;


public class MinimumNoOfDeletions {

    private static int longestPalindromeString(String str, int i, int j) {
        if (i >= j) {
            return 0;
        }
        if (str.charAt(i) == str.charAt(j)) {
            return longestPalindromeString(str, i + 1, j - 1);
        }
        return 1 + Math.min(longestPalindromeString(str, i + 1, j),
        		longestPalindromeString(str, i, j - 1));
    }

    // calculate minimum deletions
    private static int minDeletions(String str) {
        return longestPalindromeString(str, 0, str.length() - 1);
    }

    public static void main(String[] args) {
        String inputString = "aebcbda";
        
        System.out.println("Minimum number of deletions: " + minDeletions(inputString));
    

    }
}