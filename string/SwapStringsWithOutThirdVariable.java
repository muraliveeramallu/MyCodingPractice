package string;

public class SwapStringsWithOutThirdVariable {

	public static void main(String[] args) {
		String s1 = "Murali";
		String s2 = "Sravani";
		
		s1 = s1.concat(s2);
		s2 = s1.substring(0,s1.length()-s2.length());
		s1 = s1.substring(s2.length(), s1.length());
		
		System.out.println(s1);
		System.out.println(s2);

	}
	
	

}
