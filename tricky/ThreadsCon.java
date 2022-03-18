package tricky;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class ThreadsCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable runnable = () -> {
			try {
				String name = Thread.currentThread().getName();
				System.out.println("Foo " + name);
				TimeUnit.SECONDS.sleep(1);

				System.out.println("Bar " + name);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};

		Callable callable = () -> {
			System.out.println("CallableLamda Thread");
			return Thread.currentThread().getName();
		};


        ExecutorService executor = Executors.newFixedThreadPool(10);
        Executors.new
		Thread thread = new Thread(runnable);
		thread.start();
		Thread thread1 = new Thread1();
		thread1.start();
		Thread threadInClass = new ThreadsCon().new InMainClassThread();
		threadInClass.start();
		Thread thread2 = new Thread(new RunnableThread());
		thread2.start();

		Callable callable1 = new CallableThread();
		FutureTask futureTask1 = new FutureTask(callable1);
		FutureTask futureTask2 = new FutureTask(callable);
		Thread thread3 = new Thread(futureTask1);
		Thread thread4 = new Thread(futureTask2);
		thread3.start();
		try {
			System.out.println(futureTask1.get());
			System.out.println(futureTask2.get());
		} catch (InterruptedException | ExecutionException | NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	class InMainClassThread extends Thread {
		@Override
		public void run() {
			System.out.println("Extend Threa with in class Example");
		}
	}
}

class Thread1 extends Thread {
	@Override
	public void run() {
		System.out.println("Extend Threa Example");
	}
}

class RunnableThread implements Runnable {
	@Override
	public void run() {
		System.out.println("Runnable implement Example");
	}
}

class CallableThread implements Callable<String> {
	@Override
	public String call() throws Exception {
		System.out.println("Callable Implement");
		return Thread.currentThread().getName();
	}
}
