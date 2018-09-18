package com.example.snehaanandyeluguri.myapplication.math;

/**
 * Created by snehaanandyeluguri on 7/14/18.
 */

public class PerfectSquare {
    public boolean isPerfectSquare(double x){
        double sqrt = Math.sqrt(x);

        return (sqrt-Math.floor(sqrt)==0);
    }
}
