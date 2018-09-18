package com.example.snehaanandyeluguri.myapplication.string.array;

import java.util.*;
import java.util.Arrays;
/**
 * Created by snehaanandyeluguri on 7/8/18.
 */

public class PalindromeString {

    public boolean isPalindrome(String s){
        if(s!=null&&!s.isEmpty())
        {
            s=s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            char[] updatedCharList=s.toCharArray();
            int charLength =updatedCharList.length;
            for (int i = 0; i < charLength / 2; i++) {
                if (updatedCharList[i] != updatedCharList[charLength - i-1]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
