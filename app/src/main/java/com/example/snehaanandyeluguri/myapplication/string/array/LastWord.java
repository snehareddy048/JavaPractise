package com.example.snehaanandyeluguri.myapplication.string.array;

import java.util.ArrayList;

/**
 * Created by snehaanandyeluguri on 7/29/18.
 */

public class LastWord {

    public String splitLastWord(String sentence){
        if(sentence!=null&&!sentence.isEmpty()) {
            String[] sentenceSplit = sentence.split(" ");
            return sentenceSplit[sentenceSplit.length - 1];
        }
        return "";
    }

    public String spaceLastWord(String sentence){
        char[] chars = sentence.toCharArray();
        int index=0;
        for(int i=0;i<chars.length;i++){
            if(chars[i]==' '&&index<i){
                index=i;
            }
        }
        return (index!=0)?sentence.substring(index+1,sentence.length()):"";
    }
}
