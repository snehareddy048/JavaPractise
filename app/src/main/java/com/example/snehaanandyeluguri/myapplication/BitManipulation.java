package com.example.snehaanandyeluguri.myapplication;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by snehaanandyeluguri on 7/13/18.
 */
//Given an array of integers, every element appears twice except for one. Find that single one.
public class BitManipulation {

    Set<Integer> singleSet=new HashSet<>();

   public Set<Integer> getSingleNumber(ArrayList<Integer> numList) {
       for(int num:numList) {
          boolean notExists=singleSet.add(num);
       if(!notExists){
       //find and delete the duplicate
           singleSet.remove(num);
       }
       }
       return singleSet;
   }
}
