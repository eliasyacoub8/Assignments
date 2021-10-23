package exceptionhandling;

public class CustomException {
	
	  static void validate(int salary)throws SalaryException{  
		     if(salary<2100)  
		      throw new SalaryException("You need to work hard");  
		     else if (salary>2100 & salary<5000)
		      System.out.println("Your salary is somehow good");  
		     else if(salary>5000 & salary<9000)
		    	 System.out.println("Your salary is very good");
		   }  
		     
		   public static void main(String args[]){  
		      try{  
		        validate(2200);  
		      }
		      catch(Exception m)
		      {
		    	  System.out.println("Exception occured: "+ m.getMessage());
		      }  
		  
		      System.out.println("rest of the code...");  
		  }  
		}  

	//This class is created for your own defined exception message
	class SalaryException extends Exception{  // 1
		
		//private static final long serialVersionUID = 1L;

		SalaryException(String s){
	
		  super(s);  
		 }  

}
