package vehicle;

abstract class MNC 
{
	
 String size;
 String operation;
 boolean highAssets;
 boolean sophisticatedTechnology;

 MNC(){
	size="Large";
	operation="Worldwide";
	highAssets=true;
	sophisticatedTechnology=true;
	System.out.println("MNC is created");
 }
  
 abstract void multinationaloperation();
 abstract void generatingrevenue();
 
 public void makeforeigninvestments() 
 {
	
 }
 
}

abstract class Infosys extends MNCclass 
{
	
	abstract void multinationaloperation1();
	 abstract void generatingrevenue1();
	 abstract void multinationaloperation();
	 abstract void generatingrevenue();
	public void employees() {
		// TODO Auto-generated method stub
		
	}

	public void makeforeigninvestments() {
		 System.out.println("The company makes foreign direct investments");
		
	}
}



class Info extends Infosys {
	void multinationaloperation() {
		System.out.println("Operates in multiple countries");
		
		
	}
	void multinationaloperation1() {
		System.out.println("Might Operate in multiple countries");
		
	}
	void generatingrevenue1() {
		System.out.println("Generating revenue");
		
	}
	 void generatingrevenue() {
		 System.out.println("Generating revenue");
		 
	 }
	
	 
	 public void employees() {
		 
		 System.out.println("Has more than 100 employees");
	 }
	 
	 
}


public class MNCclass{
	public static void main(String args[]) {
		
		Infosys b = new Info();
		b.generatingrevenue1();
		
		b.generatingrevenue();
		b.multinationaloperation1();
		b.multinationaloperation();
		b.employees();
		b.makeforeigninvestments();
		
	}
}