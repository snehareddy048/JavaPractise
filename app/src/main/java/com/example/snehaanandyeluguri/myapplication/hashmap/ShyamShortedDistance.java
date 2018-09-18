package com.example.snehaanandyeluguri.myapplication.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by snehaanandyeluguri on 7/13/18.
 */
//https://www.programcreek.com/2014/07/leetcode-shortest-word-distance-ii-java/
public class ShyamShortedDistance {
    int shortdistance;
    HashMap<String,Integer> wordLocation;
    String word1;
    String word2;

    public int getShortDistance (String word1, String word2, ArrayList<String> wordList){
        shortdistance = wordList.size();
        wordLocation = new HashMap();
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        this.word1 = word1;
        this.word2 = word2;

        for(int i = 0; i< wordList.size(); i++){
            String word = wordList.get(i).toLowerCase();
            if(word.equals(word1)){
                wordLocation.put(word1,i);
                if(wordLocation.size()==2){
                    calculateShotestDistance();
                    wordLocation.put(word1,i);
                }
            } else if(word.equals(word2)){
                wordLocation.put(word2,i);
                if(wordLocation.size()==2){
                    calculateShotestDistance();
                    wordLocation.put(word2,i);
                }}}
        return shortdistance;
    }
    private void calculateShotestDistance(){
        int distance = Math.abs(wordLocation.get(word1)-wordLocation.get(word2));
        shortdistance = shortdistance< distance? shortdistance : distance;
        wordLocation.clear();
    }}
