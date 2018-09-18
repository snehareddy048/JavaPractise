package com.example.snehaanandyeluguri.myapplication.math;

import java.util.HashMap;

/**
 * Created by snehaanandyeluguri on 7/9/18.
 */

public class Fraction {
    public String getFraction(int numerator,int denominator){
        if(numerator==0){
            return "0";
        }
        if(denominator==0){
            return "";
        }
        int div=numerator/denominator;
        int remainder=numerator%denominator;
        int fraction=0;
        if(remainder!=0)
        {
            fraction=(remainder*10)/denominator;
            remainder=(remainder*10)%denominator;//updated
            if(remainder!=0&&remainder==(remainder*10)%denominator)
            {
                return String.valueOf(div+".("+fraction+")");
            }
        }
        return String.valueOf(div+"."+fraction);
    }
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0)
            return "0";
        if (denominator == 0)
            return "";

        String result = "";

        // if result is negative
        if ((numerator < 0) ^ (denominator < 0)) {
            result += "-";
        }
        // convert int to long
        long num = numerator, den = denominator;
        num = Math.abs(num);
        den = Math.abs(den);
        // quotient
        long res = num / den;
        result += String.valueOf(res);
        // if remainder is 0, return result
        long remainder = (num % den) * 10;
        if (remainder == 0)
            return result;

        // right-hand side of decimal point
        HashMap<Long, Integer> map = new HashMap<Long, Integer>();
        result += ".";
        while (remainder != 0) {
            // if digits repeat
            if (map.containsKey(remainder)) {
                int beg = map.get(remainder);
                String part1 = result.substring(0, beg);
                String part2 = result.substring(beg, result.length());
                result = part1 + "(" + part2 + ")";
                return result;
            }

            // continue
            map.put(remainder, result.length());
            res = remainder / den;
            result += String.valueOf(res);
            remainder = (remainder % den) * 10;
        }

        return result;
    }
}
