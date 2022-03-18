package Cisco;
/*
Print even and odd numbers in increasing order using two threads in Java
Difficulty Level : Hard
Last Updated : 27 Jan, 2022
Prerequisite: Multithreading

Given an integer N, the task is to write Java Program to print the first N natural numbers in increasing order using two threads.

Examples:

Input: N = 10
Output: 1 2 3 4 5 6 7 8 9 10

Input: N = 18
Output: 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18
*/
public class EvenAndOddThread {

    int number = 1;

    public void printOddNumber() {
        System.out.print(number);
        Thread.wait();


    }

    public void printEvenNumber(){

    }

}
