package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * Class for Daemon Thread
 * 
 * @author Pooja Patidar
 *
 */

public class DaemonThreadDemo extends Thread {
	public static final Logger myLogger = Logger.getLogger("/core-java/src/multithreading/DaemonThreadDemo.java");
	
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			myLogger.setLevel(Level.FINE);
			myLogger.log(Level.INFO,"Daemon Thread");
			
		}
		else {
			myLogger.log(Level.INFO,"User Thread");
		}
	}
	
	public static void main(String[] args) {
		
		DaemonThreadDemo dt1 = new DaemonThreadDemo();
		DaemonThreadDemo dt2 = new DaemonThreadDemo();
		DaemonThreadDemo dt3 = new DaemonThreadDemo();
		
		dt1.setDaemon(true); //setting the object as daemon thread
		
		dt1.start();
		dt2.start();
		dt3.start();
	}

}
