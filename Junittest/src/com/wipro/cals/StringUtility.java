package com.wipro.cals;
public class StringUtility {

    // Reverses the input string
    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    // Checks if the input string is a palindrome
    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }
        String reversed = reverse(input);
        return input.equals(reversed);
    }

    // Checks if the input string is empty
    public boolean isEmpty(String input) {
        return input == null || input.isEmpty();
    }
}
