package com.example.snehaanandyeluguri.myapplication.string.array;

/**
 * Created by snehaanandyeluguri on 8/9/18.
 */

public class ClosestSum {
    int sum;
    public int findClosestSum(int[] S,int comparableSum){
        int closestSum=0;
        for(int i=0;i<S.length-2;i++){
            int count=1;
             sum=0;
            while(count<=3){
                sum=sum+S[i];
                sum=Math.abs(sum);
                if(Math.abs(comparableSum-sum)<closestSum){
                    comparableSum=Math.abs(comparableSum-sum);
                }
                count++;
            }
        }
        return comparableSum;
    }
}
