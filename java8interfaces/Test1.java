package java8interfaces;

//@FunctionalInterface
public interface Test1 {
	
	public void abstartcTest1();
	public void abstartcTest2();
	
	default void testDefault1() {
		System.out.println("Hi1");
	}
	
	default void testDefault2() {
		System.out.println("Hi1");
	}
	
	static void testStatic1() {
		System.out.println("Hi1");
	}
	
	static void testStatic2() {
		System.out.println("Hi1");
	}

}
