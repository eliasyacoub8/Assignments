package Classday2;

public class students {

	String name;  
	int age;
	char classsection;
	char gender;
	int subject1, subject2,subject3;
	int subject=subject1+subject2+subject3;
	
	
	public students()  // default constructor
	{
		name = "Noname";
		age=0;
		classsection='c';
		gender='O';
		subject1=0;
		subject2=0;
		subject3=0;
		
			
	}
	 students(String n,int a,char x, char c,int subject1,int subject2,int subject3){    
		    name = n;  
		    age=a;  
		    classsection=c;
		    gender=x;
		    this.subject1=subject1;
		    this.subject2=subject2;
		    this.subject3=subject3;
		   
		    } 
	
	 students(String n,int a,char x, char c,int subject2,int subject3){    
		    name = n;  
		    age=a;  
		    classsection=c;
		    gender=x;
		    this.subject2=subject2;
		    this.subject3=subject3;
		   
		    } 
	
	
	
	   
	
	//method to display the value of id and name  
	void display()  //default modifier
	{ 	
		
		System.out.println(name+ "  "+age+ "     "+gender+ "      "+classsection+ "      "+subject1+ "       "+subject2+"       "+subject3 );
		int totalsubject=subject1+subject2+subject3;
		System.out.println("The total mark is: " +totalsubject);
	}  
	  
	  public static void main(String args[])
{  
	System.out.println("Name"+ "  "+"Age"+ "  "+"Gender"+ "  "+"Section"+ "  "+"Subject1"+ "  "+"Subject2"+"  "+"Subject3"); 
    
   students s1 = new students("Karan",25,'M','B',87,90,56);
   students s2 = new students("Jess",28,'M','G',89,100);
   students s3 = new students("Mira",27,'F','A',58,70);
   students s4 = new students("Leslie",20,'F','S',60,60,90);
    
    s1.display();
    s2.display();
    s3.display();
    s4.display();
    
    
    }  
	
	
}
