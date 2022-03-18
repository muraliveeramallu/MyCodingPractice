package recursion;

public class StringPallendromOrNot {
	
	public static void main(String arg[]) {
		System.out.println(recursion(null));
	}

	private static boolean recursion(String string) {
		if(string == null) return false;
		if(string.length() == 1 || string.length() == 0) return true;
		if(string.charAt(0) != string.charAt(string.length()-1))
			return false;
		
		recursion(string.substring(1, string.length()-1));
		return true;
	}

}
