package com.tuwaner.junit;


public class MyJunit {
    public String sayHello(){
        int i = 1;
        String s = "";
        if(i == 1){
            s = "Hello Junit1";
        }else {
            s = "Hello Junit2";
        }
        System.out.println( "Hello World!" );
        return s;
    }

    public static void main( String[] args ){
        System.out.println( "Hello World!" );
    }

    public String sayJunit(){
        return "Hello Junit";
    }
}
