package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for changing the name of main thread
 * 
 * @author Pooja
 *
 */

public class MainThread2 {
	public static final Logger myLogger = Logger.getLogger("/core-java/src/multithreading/MainThread2.java");
	
	public static void main(String[] args) {
		
		myLogger.setLevel(Level.FINE);
		myLogger.log(Level.INFO,"STARTS");
		
		Thread t=Thread.currentThread();
		String tname = t.getName();
		System.out.println(tname);  //getting the name of the main thread
		
		t.setName("Pooja");  // changing the name of main thread
		System.out.println(t.getName());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myLogger.log(Level.INFO,"ENDED");
		
		
	}

}
