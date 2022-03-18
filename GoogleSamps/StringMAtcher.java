package GoogleSamps;

public class StringMAtcher {
	
	public static void main(String a[]) {
		String s = "abc{d,e}f{gh,ij}";
		String s2 = s.substring(s.lastIndexOf('{')+1, s.lastIndexOf('}'));
		String[] s3 = "abc{d,e}f{gh,ij}".split("[{}]");
		System.out.println("Hi");;
		
		
	}

}
