package com.example.snehaanandyeluguri.myapplication.string.array;
import java.util.*;
/**
 * Created by snehaanandyeluguri on 7/8/18.
 */

public class IsomorphicStrings {

    public boolean isIsomorphic(ArrayList<String> comparableStrings){
        HashMap<Character,Character> comparableMap=new HashMap<>();
        char[] firstComparable=comparableStrings.get(0).toCharArray();
        char[] secondComparable=comparableStrings.get(1).toCharArray();
        if(firstComparable.length==secondComparable.length){
            for(int i=0;i<firstComparable.length;i++)
            {
                char firstComparableChar=firstComparable[i];
                char secondComparableChar=secondComparable[i];
                if(comparableMap.containsKey(firstComparableChar)){
                    if(comparableMap.get(firstComparableChar)!=secondComparableChar ){
                        return false;
                    }
                }
                else{
                    if(comparableMap.containsValue(secondComparableChar)){
                        return false;
                    }
                    else{
                        comparableMap.put(firstComparableChar,secondComparableChar);
                    }
                }
            }
            return true;
        }
        return false;
    }
}
