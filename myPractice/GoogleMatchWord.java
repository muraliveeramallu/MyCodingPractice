package myPractice;

import java.util.Arrays;

public class GoogleMatchWord {
	
	public static void main(String ar[]) {
		System.out.println(googleMatchString("g()()Gle"));
	}
	public static boolean googleMatchString(String str) {
		char[] garray = new char[] {'G','g'};
		char[] oarray = new char[] {'O','o','0'};
		char[] larray = new char[] {'L','l','|'};
		char[] earray = new char[] {'e','E','3'};
		char[] open = new char[] {'(','[','{'};
		char[] close = new char[] {')',']','}'};
		int charCount = 1;
		boolean status = true;
		if(str == null || str.length() > 8 || str.length() < 6) {
			return false;
		}
		for(int i = 0; i < str.length(); i++) {
			if(status == false)
				break;
			if (charCount == 1 || charCount == 4) {
				charCount++;
				status = String.valueOf(garray).indexOf(str.charAt(i)) < 0 ? false : true;
				continue;
			}

			if (charCount == 2 || charCount == 3) {
				charCount++;
				status = String.valueOf(oarray).indexOf(str.charAt(i)) < 0 ? false : true;
				if(!status) {
				if(String.valueOf(open).indexOf(str.charAt(i))!=-1 && String.valueOf(open).indexOf(str.charAt(i)) == (String.valueOf(close).indexOf(str.charAt(i+1)))){
					i++;
					status = true;
				} else {
					status = false;
				}
				}
				continue;
			}

			if (charCount == 5) {
				charCount++;
				status = String.valueOf(larray).indexOf(str.charAt(i)) < 0 ? false : true;
				continue;
			}

			if (charCount == 6) {
				charCount++;
				status = String.valueOf(earray).indexOf(str.charAt(i)) < 0 ? false : true;
				continue;
			}
			
			if(charCount > 7) {
				status = false;
			}
			
			
		}
		return status;
	}
	
	public static void googleMatchStringregx(String str) {

        //System.out.println(str.matches(ggle));

    }
}
