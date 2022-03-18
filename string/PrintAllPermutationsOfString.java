package string;

public class PrintAllPermutationsOfString {

	public static void main(String[] args) {
		printAllPermutations("aefty","");
		
	}

	private static void printAllPermutations(String str, String ans) {
		// TODO Auto-generated method stub
		  if(str.length() == 0) {
			  System.out.print(ans+" ");
			  return;
		  }
		  
		  for(int i=0; i<str.length();i++) {
			  char ch = str.charAt(i);
			  String ros = str.substring(0,i) + str.substring(i+1);
			  printAllPermutations(ros, ans+ch);
		  }
	}

}