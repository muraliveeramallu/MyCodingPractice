package array;

import java.util.Stack;

//Find the largest rectangular area possible in a given histogram where the largest rectangle 
//can be made of a number of contiguous bars. For simplicity, assume that all bars have same width and the width is 1 unit.

public class HistigramRectArea {

	/*
	 * private static int highestArea(int[] input) { int n = input.length; int i =
	 * 0; int top = 0; int highestArea = 0; Stack<Integer> s = new Stack();
	 * 
	 * while (i < n) { if(s.isEmpty() || input[i]>input[s.peek()]) { s.push(i++); }
	 * else { top = s.peek(); s.pop();
	 * 
	 * int area = input[top] * (i-s.peek()-1); if(area > highestArea) highestArea =
	 * area; } }
	 * 
	 * while(s.isEmpty()) { top = s.peek(); s.pop();
	 * 
	 * int area = input[top] * (i-s.peek()-1); if(area > highestArea) highestArea =
	 * area; }
	 * 
	 * return highestArea;
	 * 
	 * }
	 */
	public static int largestRectangleArea(int[] height) {
		if (height == null || height.length == 0) {
			return 0;
		}
	 
		Stack<Integer> stack = new Stack<Integer>();
	 
		int max = 0;
		int i = 0;
	 
		while (i < height.length) {
			//push index to stack when the current height is larger than the previous one
			if (stack.isEmpty() || height[i] >= height[stack.peek()]) {
				stack.push(i);
				i++;
			} else {
			//calculate max value when the current height is less than the previous one
				int p = stack.pop();
				int h = height[p];
				int w = stack.isEmpty() ? i : i - stack.peek() - 1;
				max = Math.max(h * w, max);
			}
	 
		}
	 
		while (!stack.isEmpty()) {
			int p = stack.pop();
			int h = height[p];
			int w = stack.isEmpty() ? i : i - stack.peek() - 1;
			max = Math.max(h * w, max);
		}
	 
		return max;
	}
	
    public static int largestRectangleArea2(int[] heights) {
        Stack < Integer > stack = new Stack < > ();
        stack.push(-1);
        int maxarea = 0;
        for (int i = 0; i < heights.length; ++i) {
            while (stack.peek() != -1 && heights[stack.peek()] >= heights[i])
                maxarea = Math.max(maxarea, heights[stack.pop()] * (i - stack.peek() - 1));
            stack.push(i);
        }
        while (stack.peek() != -1)
            maxarea = Math.max(maxarea, heights[stack.pop()] * (heights.length - stack.peek() -1));
        return maxarea;
    }

	public static void main(String a[]) {
		System.out.println(largestRectangleArea(new int[] { 6, 2, 5, 4, 5, 1, 6 }));
		System.out.println(largestRectangleArea2(new int[] { 6, 2, 5, 4, 5, 1, 6 }));
	}

}
