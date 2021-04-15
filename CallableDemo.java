package multithreading;

import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for Callable Method
 * 
 * @author Pooja Patidar
 *
 */

public class CallableDemo {
	
	public static final Logger myLogger = Logger.getLogger("/core-java/src/multithreading/CallableDemo.java");
	static Callable<String> cl = new Callable<String>() {
		

	public String call() throws Exception  {
		myLogger.setLevel(Level.FINE);
		myLogger.log(Level.INFO,"Callable Method");
		return null;	
	}
};

public static void main(String[] args) throws Exception {
	cl.call();
}
}