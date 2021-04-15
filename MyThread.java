package multithreading;

/**
 * Thread Class
 * 
 * @author Pooja Patidar
 *
 */

public class MyThread extends Thread {
	public void run() {
		for(int i=10;i>=0;i--) {
			System.out.println("another thread:"+i);
		}
	}
	
	

}
