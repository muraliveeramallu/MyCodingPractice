package recursion;

public class ReverseStringUsingRecursion {
	
	public static void main(String a[]) {
		System.out.println(recursion("Hi How Are You"));
	}

	private static String recursion(String string) {
	   if(string == null || string.length()<=1) 
		   return string;
	   
	   System.out.println(string.substring(string.length()-1));
	   
	   return string.substring(string.length()-1) + recursion(string.substring(0, string.length()-1));
	   
	}

}
