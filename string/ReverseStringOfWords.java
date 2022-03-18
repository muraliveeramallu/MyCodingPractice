package string;

import java.util.Stack;

//This is to reverese the string of words ex: hi how are you O/P you are how hi
public class ReverseStringOfWords {

	public static void main(String[] args) {
		System.out.println(ReverseStringWords("Hi how are you doing"));
	}

	private static String ReverseStringWords(String string) {
		if(string == null)
			return null;
		
		String reveredString = new String();
		String[] splittedStr = string.split("\\s");
		Stack<String> s = new Stack<>();
		
		for(String str:splittedStr) {
			s.push(str);
		}
		
		while(!s.isEmpty()) {
			reveredString = reveredString + s.pop()+" ";
		}
		
		return reveredString;
		
	}

}
