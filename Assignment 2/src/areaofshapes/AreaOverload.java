package areaofshapes;

public class AreaOverload {
	float L1,L2,r,W1,W2,S; 
	
    //creating two arg constructor  
   AreaOverload(float Lrect1,float Lrect2,float Lrect3,float Lrect4){  
    	
    L1=L2=Lrect1;
    W1=W2=Lrect2;
    
    }     
    
   AreaOverload(long Lrect1,long Lrect2){  
    	
        L1=Lrect1;
        W1=Lrect2;

        
        }     
    
    //creating three arg constructor  
    AreaOverload(double radius){  
    r=(float) radius;
    
    } 
    
    AreaOverload(float S){  
        this.S=S;
        } 
    
    void displayRectangle()
    {
    	System.out.println("The dimensions of the rectangle:" +L1+","+W1+","+L2+ ","+W2);
    	System.out.println("The area of the rectangle is:" +(L1*W1));
    }  
    void displaySquare() 
    {
    System.out.println("The dimensions of the square:" +S);
    System.out.println("The area of the square "+ (S*S));
    
    }
    void displayCircle() 
    {
	System.out.println("The radius of the circle is:" +r);
	System.out.println("Area of Circle : "+(3.14*r*r));
	}
   
    public static void main(String args[]){  
    
    AreaOverload Rectangle = new AreaOverload(6,8,7,8);  
    AreaOverload Square = new AreaOverload(5); 
    AreaOverload Circle=new AreaOverload(23.5);
   
   
   
    Rectangle.displayRectangle();  
    Square.displaySquare(); 
    Circle.displayCircle();
   }  

}

