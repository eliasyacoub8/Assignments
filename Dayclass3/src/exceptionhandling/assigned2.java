package exceptionhandling;
import java.io.IOException;
import java.util.Scanner;

public class assigned2 {
    static int add(int num1, int num2) throws IOException { // static method
        if (num1 > num2) {
           throw new IOException("Number 1 is greater than number 2 and hence Exception is thrown");
        }
        else if(num2>num1)
        {
        	throw new ArithmeticException("Number 2 is greater than number 1 and hence Exception is thrown");
        }
        else 
        	return num1+num2;
     }
      
     public static void main(String args[]){       
  	   int result=0;
  	   Scanner scanner = new Scanner(System.in);  // taking user input from console
         
         System.out.println("Enter number 1 : ");
         int num1 = scanner.nextInt();
         
         System.out.println("Enter number 2 : ");
         int num2 = scanner.nextInt();
        
         try{
      	  result =add(num1,num2);
         }
         catch(ArithmeticException ae)
         {
      	   System.out.println(ae.getMessage());
         }
         catch(Exception am)
         {
      	   System.out.println(am.getMessage());
         }
         
         System.out.println("Result is : "+result);
     }
}
