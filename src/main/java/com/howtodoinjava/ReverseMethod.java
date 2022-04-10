package com.howtodoinjava;

public class ReverseMethod {
    public String reverseString(String hello){
        char ch[]=hello.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];
        }
        return rev;
    }
    public static void main( String[] args ) {
        ReverseMethod reverseMethod = new ReverseMethod();
        String reverse = reverseMethod.reverseString("hello");
        System.out.println("Reverse: "+ reverse );

        System.out.println( "Hello World!" );
    }
}
