package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for the join Method
 * 
 * @author Pooja Patidar
 *
 */

public class JoinMethodDemo extends Thread {
	public static final Logger myLogger = Logger.getLogger("/core-java/src/multithreading/JoinMethodDemo.java");
	
	public void run() {
		for(int i=0;i<=5;i++) {
			myLogger.setLevel(Level.FINE);
			myLogger.log(Level.INFO,""+i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		
		JoinMethodDemo d1 = new JoinMethodDemo();
		JoinMethodDemo d2 = new JoinMethodDemo();
		JoinMethodDemo d3 = new JoinMethodDemo();
		
		d1.start();
		try {
			d1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d2.start();
		d3.start();
		
	}

}
