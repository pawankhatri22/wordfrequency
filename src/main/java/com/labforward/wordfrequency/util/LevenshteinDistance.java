package com.labforward.wordfrequency.util;

import java.util.Arrays;

public class LevenshteinDistance {

    public static int findLevenshteinDistance(String word1, String word2){
        int mem[][] = new int[word1.length()+1][word2.length()+1];
        for (int i = 0; i <= word1.length(); i++)
        {
            for (int j = 0; j <= word2.length(); j++) {
                
                if (i == 0) {
                    mem[i][j] = j;
                }

          
                else if (j == 0) {
                    mem[i][j] = i;
                }

                else {


                    mem[i][j] = min_edits(mem[i - 1][j - 1]
                                    + replacements(word1.charAt(i - 1),word2.charAt(j - 1)), // replace
                            mem[i - 1][j] + 1, // delete
                            mem[i][j - 1] + 1); // insert
                }
            }
        }

        return mem[word1.length()][word2.length()];
    }




    static int min_edits(int... nums)
    {

        return Arrays.stream(nums).min().orElse(
                Integer.MAX_VALUE);
    }

    static int replacements(char c1, char c2)
    {
        return c1 == c2 ? 0 : 1;
    }



}

