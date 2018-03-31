package threads;

public class MyThread2 extends Thread {
	
	public void run() {
		System.out.println("Inside run ...");
		go();
	}

	private void go() {
		System.out.println("Inside go ...");
		more();
	}
	
	private void more() {
		System.out.println("Inside more ...");
	
	}
	
	public static void main(String[] args) {
		Thread myThread = new MyThread2();
		myThread.start();
		
		System.out.println("Inside main ...");
	}
}