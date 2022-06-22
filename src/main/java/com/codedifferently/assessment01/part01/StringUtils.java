package com.codedifferently.assessment01.part01;

import static com.codedifferently.assessment01.part01.BasicStringUtils.camelCase;
import static com.codedifferently.assessment01.part01.BasicStringUtils.reverse;

public class StringUtils {
    /**
     * Get all the words in the sentence and return it in a string array
     * @param sentence
     * @return
     */
    public static String[] getWords(String sentence){
        String[] words = sentence.split("[\\W_]+");
        return words;
    }

    /**
     * Get the first word in the string
     * @param sentence
     * @return
     */
    public static String getFirstWord(String sentence){

       return getWords(sentence)[0];

    }

    /**
     * Grab the first word and reverse it
     * @param sentence
     * @return
     */
    public static String reverseFirstWord(String sentence){

        return reverse(getWords(sentence)[0]);
    }

    /**
     * Grab the first word then camel case it
     * @param sentence
     * @return
     */
    public static String reverseFirstWordThenCamelCase(String sentence){
        return camelCase(reverse(getWords(sentence)[0]));
    }

    /**
     * Remove Character at index
     * @param str
     * @param index
     * @return
     */
    public static String removeCharacterAtIndex(String str, int index){
        StringBuilder output = new StringBuilder();
        output.append(str);
        output.deleteCharAt(index);
        return output.toString();
    }
}
