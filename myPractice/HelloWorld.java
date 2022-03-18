package myPractice;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HelloWorld {

    public static void main(String[] args) {
       System.out.println(printHelloWorld("HelloWorld", 10));
    }
    
    public static String printHelloWorld(String string, int count){
        String output="";
        for(int i = 1; i<=count; i++) {
            if(i < count) {
            	output = output + "HelloWord-";
            } else {
            	output = output + "HelloWord";
            }            
        }
        return output;
    }
}