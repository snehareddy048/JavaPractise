package com.example.snehaanandyeluguri.myapplication.hashmap;

import java.util.HashMap;
import java.util.List;

/**
 * Created by snehaanandyeluguri on 9/15/18.
 */

public class ShortestDistanceSneha {

    public int getShortestDistance(List<String> stringValues,String s1,String s2){
        int shortestDistance=Integer.MAX_VALUE;
        int firstValueLocation=Integer.MAX_VALUE;
        int secondValueLocation=Integer.MAX_VALUE;
        if(s1!=null&&!s1.isEmpty()&&!s1.trim().isEmpty()&&s2!=null&&!s2.isEmpty()&&!s2.trim().isEmpty()
                &&stringValues.contains(s1)&&stringValues.contains(s2)) {
            for (int i = 0; i < stringValues.size(); i++) {
                String s = stringValues.get(i);
                if (s.equalsIgnoreCase(s1)) {
                    firstValueLocation = i;
                } else if (s.equalsIgnoreCase(s2)) {
                    secondValueLocation = i;
                }
                int distance=Math.abs(firstValueLocation - secondValueLocation);
                if(distance<shortestDistance)
                {
                    shortestDistance=distance;
                }
            }
        }
        return shortestDistance;
    }
}
