package myPracticeSet2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Stack;

public class RunningMed {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RunningMed r = new RunningMed();
		Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i = 0; i<length; i++) {
        	//a[i] = in.nextInt();
        	a.add(in.nextInt());
        	Collections.sort(a);
        	r.getMedium(a,i);
        }
       
	}
    
	public void getMedium(ArrayList<Integer> a, int count) {
		
		
		if(count==0) {
			System.out.println(a.get(0));
			return;
		}	
		
		double d = count/2.0;
		//System.out.println(d);
		int ceil = (int) Math.ceil(d);
		int floor = (int) Math.floor(d);
		
		System.out.println((a.get(ceil)+a.get(floor))/2.0);
		
	}
}
