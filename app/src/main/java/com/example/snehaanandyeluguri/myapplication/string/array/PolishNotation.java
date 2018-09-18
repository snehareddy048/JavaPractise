package com.example.snehaanandyeluguri.myapplication.string.array;

import java.util.Stack;
/**
 * Created by snehaanandyeluguri on 7/7/18.
 */

public class PolishNotation {
    public void calculatedValue(String stringToCalculate) {
        Stack<Integer> numStack = new Stack<Integer>();
        //assuming we get only the correct values
        for(int i=0;i<stringToCalculate.length();i++) {
            String charValue = stringToCalculate.substring(i, i+1);

            switch (charValue) {
                case "+":
                    numStack.push(getstackpop(numStack) + getstackpop(numStack));
                    break;
                case "-":
                    numStack.push(numStack.pop() - numStack.pop());
                    break;
                case "*":
                    numStack.push(numStack.pop() * numStack.pop());
                    break;
                case "/":
                    numStack.push(numStack.pop() / numStack.pop());
                    break;
                default:
                    numStack.push(Integer.valueOf(charValue));
                    break;
            }

        }
        System.out.println(numStack.pop());
    }
    private int getstackpop(Stack<Integer> stack){
        if(!stack.empty()){
            return stack.pop();
        }
        return 0;
    }
}
