package multithreading;

/**
 * Class for runnable interface
 * 
 * @author Pooja Patidar
 *
 */

public class MyThreadRunnable implements Runnable {
	@Override
	public void run() {
		
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	}
	
	public static void main(String[] args) {
		MyThreadRunnable t = new MyThreadRunnable();
		Thread th = new Thread(t);
		MyThread tt = new MyThread();
		th.start();
		tt.start();
		
	}

}
