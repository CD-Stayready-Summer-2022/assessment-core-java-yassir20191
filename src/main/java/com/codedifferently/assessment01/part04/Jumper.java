package com.codedifferently.assessment01.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int count = 0;
        count += k/j;
        count += k%j;

        return count;

    }
}
