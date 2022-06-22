package com.codedifferently.assessment01.part01;

public class BasicStringUtils {
    /**
     * Remove Uppercase the first letter in each word, then remove all spaces
     *
     * Example
     * camelCase("the quick brown fox") should return "TheQuickBrownFox"
     * camelCase("wutang is for the children") should return "WutangIsForTheChildren"
     * @param str
     * @return
     */
    public static String camelCase(String str){
        // Creates a string array splitting the string up everytime it encounters a space using regex
        String[] words = str.split("[\\W_]+");
        //Create new string builder
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];

                word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();

            output.append(word);
        }
        return output.toString();
    }

    /**
     * Reverse the string
     * reverse("the quick brown fox") should return "xof nworb kciuq eht"
     * reverse("wutang is for the children") should return "nerdlihc eht rof si gnatuw"
     * @param str
     * @return
     */
    public static String reverse(String str){
        StringBuilder output = new StringBuilder();
        output.append(str);
        return output.reverse().toString();
    }

    /**
     * Camel case the first letter of every word, then reverse the string and remove all spaces
     * camelCaseThenReverse("the quick brown fox") should return XofNworbKciuqEht
     * camelCaseThenReverse("wutang is for the children") should return NerdlihcEhtRofSiGnatuw
     * @param str
     * @return
     */
    public static String reverseThenCamelCase(String str){
        String output = reverse(str);
        return camelCase(output);
    }

    public static String removeFirstAndLastCharacter(String str){
        StringBuilder output = new StringBuilder();
        output.append(str);
        output = output.deleteCharAt(str.length()-1);
        output = output.deleteCharAt(0);
        return output.toString();

    }
}
