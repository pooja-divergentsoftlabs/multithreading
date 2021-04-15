package multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;


	 /**
	  * Class for ExecutorService (newSingleThreadExecutor())
	  * 
	  * @author Pooja Patidar
	  *
	  */
	
	public class ExecutorServiceExample { 
		public static final Logger myLogger = Logger.getLogger("/core-java/src/multithreading/ExecutorServiceExample.java");
		  
	    public static void main(String[] args) {  
	        ExecutorService executorService = Executors.newSingleThreadExecutor();  
	        executorService.execute(new Runnable() {  
	              
	            @Override  
	            public void run() {  
	            	myLogger.setLevel(Level.FINE);
	        		myLogger.log(Level.INFO,"Executor Service"); 
	                  
	            }  
	        });  
	        executorService.shutdown();  
	    }  
	}   
	
	
	
	
	
	
	
	


