package exceptionhandling;

public class mutliclassexcep {
	public static void main(String[] args) {
		try{    
            int a[]=new int[5];  
            a[6]=9;   
            checkException();
                                                                 
           }    
          catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }  
       
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
       
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              } 
		
       finally{
    	   System.out.println("rest of the code");
       }
	}
		
		public static void checkException() { // called method
	        try {
	        	int a[]=new int[5]; 
	        	a[5]=30/0;
	        }
	        	
	        finally {
	            System.out.println("Finally inside method");
	        }
	}

}
