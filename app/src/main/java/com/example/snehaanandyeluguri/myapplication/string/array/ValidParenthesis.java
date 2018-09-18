package com.example.snehaanandyeluguri.myapplication.string.array;
import java.util.*;
/**
 * Created by snehaanandyeluguri on 7/8/18.
 */

//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

   //     The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.

public class ValidParenthesis {
    public boolean isValidParenthesis(String validateString){

        HashMap<Character,Character> hashMap=new HashMap<>();
        hashMap.put('(',')');
        hashMap.put('{','}');
        hashMap.put('[',']');

        char[] validateCharArray=validateString.toCharArray();
        Stack<Character> charStack=new Stack<Character>();
        for(int i=0;i<validateCharArray.length;i++){
            char curr=validateCharArray[i];
            if(hashMap.keySet().contains(curr) ){
                charStack.push(curr);
            }
            else if(hashMap.values().contains(curr)){
                 if(!charStack.empty()&&hashMap.get(charStack.peek())==curr)
                 {
                     charStack.pop();
                 }
                 else{
                     return false;
                 }
            }

        }
        return charStack.empty();
    }
}
