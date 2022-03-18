package binaryTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterFrequency {

	public static void main(String[] args) {
		NextGreaterFrequency n = new NextGreaterFrequency();
		n.getNextGreaterFrequency(new int[] {1, 1, 2, 3, 4, 2, 1});

	}

	public void getNextGreaterFrequency(int[] inputArray) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Stack<Integer> s = new Stack<Integer>();
		int[] result = new int[] {};
		for(int i=0; i<inputArray.length;i++) {
			
			if(map.containsKey(inputArray[i])){
				int occurence = map.get(inputArray[i]);
			   map.replace(inputArray[i],occurence+1);
			} else {
				map.put(inputArray[i], 1);
			}
			
		}
		
		for(int i=0; i<inputArray.length;i++) {
			System.out.print(map.get(inputArray[i])+" ");
			
			
			s.push(map.get(inputArray[i]));
			
			
		}
	}
	//https://www.geeksforgeeks.org/next-greater-frequency-element/
}
