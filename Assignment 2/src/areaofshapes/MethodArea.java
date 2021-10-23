package areaofshapes;

public class MethodArea {
	public void area(float b,float h)
    {
         System.out.println("The area of the triangle is:" +(0.5*b*h));
         System.out.println("Area of Rhombus : "+(b*h));
    } 
    

	
	
	
    public static void main(String args[])
    {
      MethodArea ob=new MethodArea();
      ob.area(10,12);
      
    }
}
