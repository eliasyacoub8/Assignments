package vehicle;

abstract class telephoneclass {
	
	telephoneclass(){
		
		
		System.out.println("The telephone is created");
	}
	abstract void lift();
	abstract void disconnected();
	
}
abstract class smarttelephone extends telephoneclass{
	abstract void lift1();
	abstract void disconnected1();
	abstract void disconnected();
	abstract void lift();

}

class smart extends smarttelephone{
	

@Override
void lift1() {
	// TODO Auto-generated method stub
	System.out.println("The lift of a smart telephone");
}

@Override
void disconnected1() {
	// TODO Auto-generated method stub
	System.out.println("The phone disconnects when it is not in contact with ear");
}

@Override
void lift() {
	// TODO Auto-generated method stub
	
}

@Override
void disconnected() {
	// TODO Auto-generated method stub
	
}

}

public class telephone{
	 public static void main(String args[]) {
	  smarttelephone d= new smart();
	  d.lift1();
	  d.disconnected1();
	  
	 }
}