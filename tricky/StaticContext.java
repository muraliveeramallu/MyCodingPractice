package tricky;

import java.io.EOFException;
import java.io.FileNotFoundException;

public class StaticContext {

	private int x;
	private static int y;
	
	 StaticContext s = new StaticContext();

	public static void m1() throws Exception{
        s.x = 0;
		s.m2();
	
	}

	public void m2() {
       y = 0;
       m1();
	}


}
