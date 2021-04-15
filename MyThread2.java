package multithreading;

/**
 * Thread class (extends)
 * 
 * @author Pooja Patidar
 *
 */

public class MyThread2 extends Thread {
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		MyThread2 t= new MyThread2();
		MyThread t2= new MyThread();
		t.start();
		t2.start();
	}
}
