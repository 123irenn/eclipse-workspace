package thread;


	public class threadpriority extends Thread
	{
	      public void run()
	      {
	            System.out.println("run() method");
	            String threadName = Thread.currentThread().getName();
	            Integer threadPrio = Thread.currentThread().getPriority();
	            System.out.println(threadName + " has priority " + threadPrio);
	      }
	      public static void main(String[] args) throws InterruptedException
	      {
	    	  threadpriority t1 = new threadpriority();
	    	  threadpriority t2 = new threadpriority();
	    	  threadpriority t3 = new threadpriority();

	            t1.setPriority(Thread.MAX_PRIORITY);
	            t2.setPriority(Thread.MIN_PRIORITY);
	            t3.setPriority(Thread.NORM_PRIORITY);
	  
	            t1.start();
	            t2.start();
	            t3.start();
	      }
	
}
