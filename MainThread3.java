package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Test for getId 
 * 
 * @author Pooja
 *
 */

public class MainThread3 {
	public static final Logger myLogger = Logger.getLogger("/core-java/src/multithreading/MainThread3.java");
	public static void main(String[] args) {
		myLogger.setLevel(Level.FINE);
		myLogger.log(Level.INFO,"hii");
		
		Thread t=Thread.currentThread();
		System.out.println(t.getId());	//getting the id of thread
		myLogger.log(Level.INFO,"bye");
		
	}

}
