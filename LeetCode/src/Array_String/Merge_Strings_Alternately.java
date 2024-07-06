package Array_String;

public class Merge_Strings_Alternately {
}

class Solution {
    public String mergeAlternately(String word1, String word2) {
        String mergeWord = "";

        for (int i = 0; i < word1.length() + word2.length(); i++) {
            if (i < word1.length()) mergeWord += word1.charAt(i);
            if (i < word2.length()) mergeWord += word2.charAt(i);
        }
        return mergeWord;
    }
}