package interfaceex;

public class InterfaceWithInheritance {
	
	public static void main(String a[]) {
      C2 c = new C2();
     c.testA1();
	}

}


class C1  {
	
	public void testA1() {
		
	}
	
}

class C2 extends C1 {
	public void testA2() {
		
	}
}

abstract class A1 implements I1  {
	
}

abstract class A2 {
	
	
}

interface I1 {
	void interfaceTest();
	
}

interface I2 {
	
}