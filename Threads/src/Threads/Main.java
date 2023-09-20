package Threads;

public class Main extends MyRunnable {

	Main(int steps, String name) {
		super(steps, name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new MyRunnable(10,"Thread 1"));
		thread1.start();
		
		Thread thread2 = new Thread(new MyRunnable(15,"Thread 2"));
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch(InterruptedException e) {
			System.out.println("Error thread princip " + e);
		}
		
		System.out.println("Thread execution finished");
	}

}
