package com.codedifferently.assessment01.part05;

import java.util.Stack;

public class Palindrome {
    public Integer countPalindromes(String input){
        String temp = "";
        StringBuffer output;
        int count = 0;
        // Iterate the loop twice
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                // Get each substring
                temp = input.substring(i, j);

                // If length is greater than or equal to two
                // Check for palindrome
                if (temp.length() >= 2) {
                    // Use StringBuffer class to reverse the string
                    output = new StringBuffer(temp);
                    output.reverse();
                    // Compare substring with reverse of substring
                    if (output.toString().compareTo(temp) == 0)
                        count++;
                }
            }
        }
        // return the count
        return count+=input.length();
    }



}
