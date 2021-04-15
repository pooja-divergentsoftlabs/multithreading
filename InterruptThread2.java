package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for the interrupt method (without sleep)
 * 
 * @author Pooja Patidar
 *
 */

public class InterruptThread2 extends Thread {
	public static final Logger myLogger = Logger.getLogger("/core-java/src/multithreading/InterruptThread2.java");
	
	public void run() {
		for(int i=0;i<=5;i++) {
			myLogger.setLevel(Level.FINE);
			myLogger.log(Level.INFO,""+i);
		}
	}
	public static void main(String[] args) {
		InterruptThread2 th= new InterruptThread2();
		th.start();
		th.interrupt();
	}
}
