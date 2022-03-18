package string;

public class StringPallendrom {

	public static void main(String[] args) {
		StringPallendrom c = new StringPallendrom();
		System.out.println(c.pal1("tyt"));
		System.out.println(c.pal1("tyuyuio"));
		
		System.out.println(c.pal2("tyyt"));
		System.out.println(c.pal2("tyuyuio"));
		
		System.out.println(c.pal3("1#234qqq 34qa1D:1 1"));
		System.out.println(c.pal3("1#234qqq 34qa1D:1 1"));

	}

	private boolean pal1(String string) {
		final StringBuffer revString = new StringBuffer(string).reverse();
		if(string.equals(revString.toString()))
		return true;
		else
		 return false;	
	}
	
	private boolean pal2(String string) {
		if(string.length() == 0 || string.length() == 1)
			return true;
		if(string.charAt(0) == string.charAt(string.length()-1)) {
			return pal2(string.substring(1, string.length()-1));
		}
		else {
			return false;
		}
	}
	
	private boolean pal3(String string) {
		// TODO Auto-generated method stub
		return true;
	}

}
