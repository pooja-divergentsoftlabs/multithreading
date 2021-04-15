package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for getting name of current thread
 * 
 * @author Pooja
 *
 */

public class MainThread {
	public static final Logger myLogger = Logger.getLogger("/core-java/src/multithreading/MainThread.java");

	public static void main(String args[]) {

		myLogger.setLevel(Level.FINE);
		myLogger.log(Level.INFO, "STARTS");
		int i = 1 + 2;
		System.out.println("sum:" + i);
		Thread t = Thread.currentThread();
		String tname = t.getName();
		System.out.println("current thread is:" + tname);
		myLogger.log(Level.INFO, "ENDED");
	}

}
