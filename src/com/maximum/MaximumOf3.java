package com.maximum;

public class MaximumOf3 {
    public static void main(String[] args){
        System.out.println("Welcome to Program of finding maximum ");
        String s1="apple";
        String s2="banana";
        String s3="peach";

        System.out.println(getMax(s1,s2,s3));
        }
        private static <T extends Comparable> T getMax(T a,T b,T c){
        if(a.compareTo(b)>0 && a.compareTo(c)>0)
            return a;
          else  if(a.compareTo(b)>0 && a.compareTo(c)>0)
                return b;
          else
              return c;
    }
}
