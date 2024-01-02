import java.util.*;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder r=new StringBuilder();
        int i=0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                r.append(word1.charAt(i));
            }
            if(i < word2.length()){
                r.append(word2.charAt(i));
            }
            i++;
        }
        return r.toString();
    }
}