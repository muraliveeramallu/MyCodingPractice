package tricky;

public class tryReturn {
	void tryWithReturn() {
		try {
			return;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			System.out.println("you2");
		}
	}
	
public static void main(String a[]) {
	tryReturn tryReturn = new tryReturn();
	tryReturn.tryWithReturn();
	
}

}
