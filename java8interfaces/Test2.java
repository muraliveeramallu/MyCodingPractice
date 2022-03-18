package java8interfaces;

//@FunctionalInterface
public interface Test2 {
	
	public void abstartcTest1();
	public void abstartcTest2();
	
	default void testDefault1() {
		System.out.println("Hi2");
	}
	
	default void testDefault2() {
		System.out.println("Hi2");
	}
	
	static void testStatic1() {
		System.out.println("Hi2");
	}
	
	static void testStatic2() {
		System.out.println("Hi2");
	}

}
