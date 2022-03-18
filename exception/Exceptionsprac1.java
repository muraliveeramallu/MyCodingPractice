package exception;

public class Exceptionsprac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s = null;
         
         try {
        	 s.length();
        	 
         } catch(NullPointerException e) {
        	 System.out.println("Oh Man!!");
         }
         
	}

}
