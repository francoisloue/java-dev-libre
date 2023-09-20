package Threads;

public class MyRunnable implements Runnable {
	
	private int nbStep;
	private String name;

	
	MyRunnable(int steps, String name) {
		this.nbStep=steps;
		this.name=name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<this.nbStep; i++) {
			System.out.println("Step "+i);
			try {
				Thread.sleep(i*1000);
			} catch(InterruptedException e) {
				System.out.println("Error in thread "+this.name);
			}
		}
		System.out.println("Thread " + this.name +" finished !");
	}

}
