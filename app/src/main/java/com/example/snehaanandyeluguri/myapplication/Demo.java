package com.example.snehaanandyeluguri.myapplication;
//import com.example.snehaanandyeluguri.myapplication.matrix.MatrixZero;
//import com.example.snehaanandyeluguri.myapplication.string.array.LongestSubStringWrong;

import com.example.snehaanandyeluguri.myapplication.hashset.LongestNonRepeatingCharacters;
//import com.example.snehaanandyeluguri.myapplication.string.array.ValidParenthesisSneha;

import java.util.*;
/**
 * Created by snehaanandyeluguri on 7/4/18.
 */

public class Demo
{
    public static void  main(String args[]) {
        //ARRays/strings—5 question
//        int[] i={1,2,3,4,5,6,7};
//        ReverseArray reverse=new ReverseArray();
//        reverse.reverse(i,3);

//        String calculatedString = "21+3*";
//        PolishNotation polishNotion=new PolishNotation();
//        polishNotion.calculatedValue(calculatedString);

//        ArrayList comparableStrings=new ArrayList();
//        comparableStrings.add("bar");
//        comparableStrings.add("boo");
//        IsomorphicStrings isomorphicStrings=new IsomorphicStrings();
//        System.out.println("is isomorphic"+isomorphicStrings.isIsomorphic(comparableStrings));


        //      PalindromeString palindromeString=new PalindromeString();
        //      System.out.println("is palindrome"+palindromeString.isPalindrome("Read rum, sir, is murder"));

//        ValidParenthesis validParenthesis=new ValidParenthesis();
//        System.out.println("is valid"+validParenthesis.isValidParenthesis("[(){}]"));

        //MidLinkedList
        //addition of linkedlist

        //Math
//        Fraction fraction=new Fraction();
//        System.out.println(fraction.getFraction(1,4));
//        System.out.println(fraction.fractionToDecimal(1,4));

        //dynamic programming
        ArrayList<String> wordDict = new ArrayList<String>();
        wordDict.add("Leet");
        wordDict.add("code");
        wordDict.add("Leap");
        wordDict.add("leap");
        wordDict.add("Latch");
//        DictionaryWords dictionaryWords=new DictionaryWords();
//        System.out.println(dictionaryWords.isWordBreakable(wordDict,"Leetcode"));

        //hashmap
//        ShortestDistance dictionaryWords=new ShortestDistance(wordDict);
//        System.out.println(dictionaryWords.shortestDistance("Leet","Latch"));

//        ShyamShortedDistance shortedDistance = new ShyamShortedDistance();
//        System.out.println(shortedDistance.getShortDistance("Leet","Latch",wordDict));

//        ArrayList<Integer> integerArrayList=new ArrayList<Integer>();
//        integerArrayList.add(1);
//        integerArrayList.add(3);
//        integerArrayList.add(2);
//        integerArrayList.add(2);
//        BitManipulation bitManipulation=new BitManipulation();
//        System.out.print(bitManipulation.getSingleNumber(integerArrayList).size());

//        int[] numArray={3,2,1,5,6,4};
//        SortedkthElement sortedkthElement=new SortedkthElement();
//              System.out.println("kth largest element:"+sortedkthElement.findKthElement(numArray,2));

//        LongestSubStringWrong longestSubString=new LongestSubStringWrong();
//              System.out.println("longest substring:"+longestSubString.longestSubString("abcbbbbcccbdddadacb"));


//        LastWord lastWord=new LastWord();
//        System.out.println(lastWord.spaceLastWord("she is good"));


//        int[][] a={{1,0},{0,1}};
//        MatrixZero lastWord=new MatrixZero();
//        System.out.println((Arrays.deepToString(lastWord.makeZero(a))));

//        int[] a={1,2,-1,4};
//        ClosestSum lastWord=new ClosestSum();
//        System.out.println(lastWord.findClosestSum(a,2));

        //moveZeroesToRight
//        Integer[] cubes = new Integer[] {6, 4, 0, 5, 0, 0, 0, 1, 0};
//        Arrays.sort(cubes, Collections.reverseOrder());
//        System.out.print(Arrays.toString(cubes));


//        PerfectSquare perfectSquare=new PerfectSquare();
//        System.out.print(perfectSquare.isPerfectSquare(2550));

//        MidLinkedListSneha midLinkedList=new MidLinkedListSneha();
//
//        //LinkedList llist = new LinkedList();
//        for (int i=3; i>0; --i)
//        {
//            midLinkedList.push(i);
//
//        }
////        midLinkedList.printLinkedList();
//        printMiddle(midLinkedList);
//        printLinkedList(midLinkedList);
//        printLinkedList(midLinkedList);
//        printLinkedList(midLinkedList);
//
//
//    }
//
//    /* Function to print middle of linked list */
//    public static void printMiddle(MidLinkedListSneha start) {
//        MidLinkedListSneha.Node fast_ptr=start.head;
//        MidLinkedListSneha.Node slow_ptr=start.head;
//        if(start.head!=null) {
//            while (fast_ptr!=null&&fast_ptr.next!=null){
//                fast_ptr=fast_ptr.next.next;
//                slow_ptr=slow_ptr.next;
//            }
//            System.out.println("middle"+slow_ptr.data);
//        }
//    }
//    public static void printLinkedList(MidLinkedListSneha start) {
//        MidLinkedListSneha.Node tnode = start.head;
//        while (tnode != null) {
//            System.out.print(tnode.data + "->");
//            tnode = tnode.next;
//        }
//        System.out.println("NULL");
//
//
//    }

        //dynamic programming
//        ArrayList<String> arrayList = new ArrayList<String>();
//        arrayList.add("Leet");
//        arrayList.add("code");
//        arrayList.add("Leap");
//        arrayList.add("Leap");
//        arrayList.add("Leet");
//        ShortestDistanceSneha shortestDistanceSneha=new ShortestDistanceSneha();
//        System.out.print(shortestDistanceSneha.getShortestDistance(arrayList,"Leet","Leap"));


//        ValidParenthesisSneha validParenthesisSneha=new ValidParenthesisSneha();
//        System.out.print(validParenthesisSneha.getValidParenthesis("{}[]"));

//        StringBuilder stringBuilder=new StringBuilder();
//        String appendedString=stringBuilder.append("hello,").append("Sneha ").append("anand").toString();
//        System.out.print(appendedString);


       // type conversion
      //  System.out.println(Integer.parseInt("10"));//string to int
//        System.out.println(Double.parseDouble("10.5"));//string to double
      // System.out.println(Math.floor(10.5));//
//        double d1=(double) 10;
//        System.out.println(d1);
//int d2=(int) 10.0;
//        System.out.println(d2);
//        int i=200;
//        double du= i;//integer to double
    //    System.out.println(du);
//        d.intValue();//gives integer
//        System.out.println(String.valueOf(d));//double to string
//        Boolean b=false;
//        System.out.println(String.valueOf(b));//boolean to string

        LongestNonRepeatingCharacters longestRepeatingCharacters=new LongestNonRepeatingCharacters();
        System.out.print(longestRepeatingCharacters.longestNonRepeating("snehabcasnehabcde"));

    }
}
