package com.example.snehaanandyeluguri.myapplication.string.array;

/**
 * Created by snehaanandyeluguri on 7/6/18.
 */

import java.util.Arrays;

public class ReverseArray {


    public int[] reverse(int[] i,int position){
        int length=i.length;
        int[] j = new int[length];
        System.arraycopy(i,length-position,j,0,position);
        System.arraycopy(i,0,j,position,position+1);
        System.out.println(Arrays.toString(j));
        i=j;
        System.out.println(Arrays.toString(i));
        return i;
    }
}
