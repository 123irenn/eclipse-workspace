package exception;
class CException extends Exception {
	  public CException(String message) {
	    super(message);
	  }
	}

public class CustomException {
	 public void checkage(int age) throws CException { 
		    if(age<18) {
		      throw new CException("Not Elgible for vote");
		    } 
		    else {
		      
		      System.out.println("Elgible for vote");
		    }
		  }

	public static void main(String[] args) {
		CustomException obj=new CustomException();
		try {
			obj.checkage(19);
		}
		catch(CException e) {
		      System.out.println("Exception Occured");
		}
		// TODO Auto-generated method stub

	}

}
