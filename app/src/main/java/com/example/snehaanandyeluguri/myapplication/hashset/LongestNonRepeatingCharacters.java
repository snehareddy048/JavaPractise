package com.example.snehaanandyeluguri.myapplication.hashset;

import java.util.HashSet;

/**
 * Created by snehaanandyeluguri on 9/17/18.
 */

public class LongestNonRepeatingCharacters {
    String longestString="";


    public String longestNonRepeating(String value){
        if(value!=null&&!value.isEmpty()&&!value.trim().isEmpty()) {
        substringCalculator(value);
        }
        return longestString;
    }

    private void substringCalculator(String value){
        char[] valueArray = value.toCharArray();
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < valueArray.length; i++) {
            if (!hashSet.add(valueArray[i])) {
                if(longestString.length()<i) {
                    longestString = value.substring(0, i);
                }
                if(i<value.length()-1){
                    substringCalculator(value.substring(i+1));
                }
                break;
            }
        }
    }

}
