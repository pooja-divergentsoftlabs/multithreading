package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for Atomic Variable
 * 
 * @author Pooja Patidar
 *
 */

public class AtomicVariableDemo extends Thread {
	public static final Logger myLogger = Logger.getLogger("/core-java/src/multithreading/AtomicVariableDemo.java");
	
	int count = 0;
	public void run() {
		int max = 10;
		
		for(int i=0; i<max; i++) {
			count++;
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		AtomicVariableDemo av = new AtomicVariableDemo();
		Thread one = new Thread(av,"one");
		Thread two = new Thread(av,"two");
		Thread three = new Thread(av,"three");
		
		one.start();
		two.start();
		three.start();
		
		one.join();
		two.join();
		three.join();
		
		myLogger.setLevel(Level.FINE);
		myLogger.log(Level.INFO,"Callable Method"+av.count);
		
	}
	
}
