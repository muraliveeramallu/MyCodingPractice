package goldMan;

public class StringToNumber {

	public static void main(String[] args) {
		System.out.println(getNumber("567"));
		System.out.println(getNumber("-567"));
	}

	private static int getNumber(String string) {
		int result = 0;
		boolean isNegative = false;
		for(int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == '-') {
				isNegative = true;
				continue;
			}
			int number = string.charAt(i)-'0';
			result = (result+number);
			if(i< string.length()-1) {
				result = result*10;
			}
		}
		return isNegative?-result:result;
	}

}
