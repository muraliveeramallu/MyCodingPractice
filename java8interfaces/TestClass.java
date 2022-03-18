package java8interfaces;

public class TestClass implements Test1, Test2 {

	@Override
	public void abstartcTest1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abstartcTest2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testDefault2() {
		System.out.println("In Child");
	}

	@Override
	public void testDefault1() {
		// TODO Auto-generated method stub
		Test2.super.testDefault1();
	}

	public static  void main(String[] a) {
		
		Test1 t = new TestClass();
		
		t.testDefault1();
		Test1.testStatic1();
		 
		 System.out.println("Main Method");
		
	}

}
