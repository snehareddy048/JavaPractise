//package com.example.snehaanandyeluguri.myapplication.string.array;
//
//import java.util.HashMap;
//
///**
// * Created by snehaanandyeluguri on 9/15/18.
// */
//
//public class ValidParenthesisSneha {
//
//    public boolean getValidParenthesis(String stringValue){
//        if(stringValue!=null&&!stringValue.isEmpty()&&!stringValue.trim().isEmpty()){
//            HashMap hashMap=new HashMap();
//            hashMap.put("{","}");
//            hashMap.put("{",")");
//            hashMap.put("[","]");
//            for(int i =0;i<stringValue.length()-1;i++){
//                if(hashMap.get(stringValue.charAt(i))!=null) {
//                    if (!hashMap.get(stringValue.charAt(i)).equals(stringValue.charAt(i + 1))){
//                        return false;
//                    }
//                    if(stringValue.length()-1==i+1)
//                    {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
//}
