package Classday2;

public class calculate {

		 

		   /** returns the minimum of two numbers */
		   public static int Add(int n1, int n2) {
		      int sum;//(local variable)
		      
		      sum=n1+n2;
		      return sum; 
		   }
		   
		   public static float areacirclecalulate(float r) {
			  
			   
			   double a=(3.14*r*r);
			   a=(float)a;
			   return (float) a;
			   
			   }
		   
		   public static int arearectanglecalulate (int a, int b) {
			   	int arearect;
			   	
			   	arearect=a*b;
			   	return arearect;
			   }
		   
		   public static void main(String args[])
		   {  
			   int c = Add(5, 6); //calling of a method
			      System.out.println("Sum is: " + c);
			      float d = areacirclecalulate(6); //calling of a method
			      System.out.println("Area of circle is: " + d);
			      
			      float e = arearectanglecalulate(6,9); //calling of a method
			      System.out.println("Area of Rectangle is: " + e);
		   	  
		       }  
		   	   
		   
	}


