package thread;
class Reverse extends Thread
{
     public void run()
     {
          try
          {
        	  System.out.println("");
        	 
               System.out.println("\nReverse is: ");
               
               for (int i=10; i >= 1 ;i-- )
               {
                    System.out.print(i+"  ");
               }
               System.out.println(" ");
              
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}

