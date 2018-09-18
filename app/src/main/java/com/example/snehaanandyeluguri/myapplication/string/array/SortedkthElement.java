package com.example.snehaanandyeluguri.myapplication.string.array;

import java.util.Arrays;

/**
 * Created by snehaanandyeluguri on 7/28/18.
 */

public class SortedkthElement {
    public int findKthElement(int[] numArray,int position){
        Arrays.sort(numArray);
        return numArray[numArray.length-position];
    }

}
