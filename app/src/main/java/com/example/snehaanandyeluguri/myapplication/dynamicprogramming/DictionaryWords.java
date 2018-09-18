package com.example.snehaanandyeluguri.myapplication.dynamicprogramming;

import java.io.PrintStream;
import java.util.ArrayList;

/**
 * Created by snehaanandyeluguri on 7/12/18.
 */

public class DictionaryWords {
private ArrayList<String> wordList;
    private String word;

    public boolean isWordBreakable(ArrayList<String> wordList, String word){
        this.wordList=wordList;
        this.word=word;
        int lastIndex=word.length();
        if(lastIndex!=0&&!word.isEmpty()) {
            int value=0;
            return calculateWord(value);
        }
        return false;
    }

        private boolean calculateWord(int start){
            String wordSub="";
            for (int i = start; i <= word.length(); i++) {
                wordSub=word.substring(start, i);
                for(String wordCheck:wordList) {
                    if (wordSub.equalsIgnoreCase(wordCheck)) {
                        if(i!=word.length())
                        {
                            return calculateWord(i);
                        }else{
                            System.out.println("Passed");
                            return true;
                        }

                    }
                }
            }
            return false;
        }


//    private boolean calculateWord(int start){
//        String wordSub="";
//        for (int i = start; i <= word.length(); i++) {
//            wordSub=word.substring(start, i);
//            for(String wordCheck:wordList) {
//                if (wordSub.equalsIgnoreCase(wordCheck)) {
//                    if(i!=word.length())
//                    {
//                        return calculateWord(i);
//                    }else{
//                        System.out.println("Passed");
//                        return true;
//                    }
//
//                }
//            }
//        }
//        return false;
//    }


       // private boolean


}
