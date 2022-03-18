import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDeadLock {
	
	public static Object ob1 = new Object();
	public static Object ob2 = new Object();

	public static void main(String[] args) {
		Runnable r1 = () -> {
			synchronized(ob1){
				System.out.println("Acquire Lock on Ob1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized(ob2) {
					System.out.println("Dead Lock");
				}
			}
		};
		//ExecutorService executor = Executors.newFixedThreadPool(10);
		
		Runnable r2 = () -> {
			synchronized(ob2){
				System.out.println("Acquire Lock on Ob2");
				synchronized(ob1) {
					System.out.println("Dead Lock");
				}
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	
	}

}
