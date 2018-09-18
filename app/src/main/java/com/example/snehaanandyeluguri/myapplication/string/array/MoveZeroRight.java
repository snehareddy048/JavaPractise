package com.example.snehaanandyeluguri.myapplication.string.array;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by snehaanandyeluguri on 9/5/18.
 */

public class MoveZeroRight {
public void moveRight(){
    Integer[] cubes = new Integer[] {6, 4, 0, 5, 0, 0, 0, 1, 0};
    Arrays.sort(cubes, Collections.reverseOrder());
    System.out.print(Arrays.toString(cubes));


}
}
