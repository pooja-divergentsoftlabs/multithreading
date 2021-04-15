package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for the interrupt method (with thread in sleep condition)
 * 
 * @author Pooja Patidar
 *
 */

public class InterruptThread extends Thread {
	public static final Logger myLogger = Logger.getLogger("/core-java/src/multithreading/InterruptThread.java");

	public void run() {
		try {
			Thread.sleep(1000);
			myLogger.setLevel(Level.FINE);
			myLogger.log(Level.INFO, "Thread");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		InterruptThread it = new InterruptThread();
		it.start();

		it.interrupt();
	}

}
