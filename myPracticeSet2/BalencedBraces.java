package myPracticeSet2;

import java.util.Stack;

public class BalencedBraces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BalencedBraces b = new BalencedBraces();
		System.out.println("{[({})]} is Balanced? "+b.hasBalancedBraces("{[({})]}"));
		System.out.println("{[({)}]}} is Balanced? "+b.hasBalancedBraces("{[({)}]}"));
		System.out.println("([{{[({})]})]} is Balanced? "+b.hasBalancedBraces("([{{[({})]})]}"));
		System.out.println("{[({)]} is Balanced? "+b.hasBalancedBraces("{[({)]}"));
		System.out.println("[({[({})]})] is Balanced? "+b.hasBalancedBraces("[({[({})]})]"));
		System.out.println("])}[({})]})] is Balanced? "+b.hasBalancedBraces("])}[({})]})]"));

	}
	
	private boolean hasBalancedBraces(String braces) {
		if(braces == null || braces.length()%2>0) {
			return false;
		}
		
		Stack<Character> s = new Stack<Character>();
		
		for(int i=0; i<braces.length();i++) {
			if(braces.charAt(i) == '[' || braces.charAt(i) == '{' || braces.charAt(i) == '(' ) {
				s.push(braces.charAt(i));
			} else if(braces.charAt(i) == ']' || braces.charAt(i) == '}' || braces.charAt(i) == ')' ) {
				if(!s.isEmpty()){
                    char latestOpenP = s.pop();
                    if(latestOpenP == '(' && braces.charAt(i) != ')'){
                        return false;
                    } else if(latestOpenP == '{' && braces.charAt(i) != '}'){
                        return false;
                    } else if(latestOpenP == '[' && braces.charAt(i) != ']'){
                        return false;
                    }
                } else {
                    return false;
                }

			}
		}
		
		
		return s.isEmpty();
		
	}
	
	private boolean Aproach2(String braces) {
		if(braces == null || braces.length()%2>0) {
			return false;
		}
		//braces.trim().re;
		for(int i=0,j=braces.length()-1;i<braces.length()/2;i++,j--) {
			if(braces.charAt(i)=='{' && braces.charAt(j)!='}') {
				return false;
			}
			if(braces.charAt(i)=='[' && braces.charAt(j)!=']') {
				return false;
			}
			if(braces.charAt(i)=='(' && braces.charAt(j)!=')') {
				return false;
			}
		}
		return true;
		
	}

}
