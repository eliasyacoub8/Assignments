package vehicle;

 abstract class penclass {
	
	abstract void write();
	abstract void refill();
	
}

 abstract class fountainpen extends penclass{
	 
	 abstract void changeNib();
 }
 
 class display extends fountainpen{
	 
	 void changeNib() {
		 
		 System.out.println("The nib of the pen changes");
		 }

	@Override
	void write() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void refill() {
		// TODO Auto-generated method stub
		
	}
 }
 
 public class pen{
	 public static void main(String args[]) {
	 fountainpen c=new display();
	 c.changeNib();
	 
	 }
 }