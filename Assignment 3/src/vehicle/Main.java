package vehicle;

abstract class vehicle {
	
	public int speed;
	public long distance;
	public float fuel;
	public String vehiclestatus;
	public char gasstatus;
	public String nos_of_tires;
	
public vehicle() //default constructor
{
	speed=0;
	distance=0;
	
}
public vehicle(int speed, long distance) {
	this.speed=speed;
	this.distance=distance;
}

public void fuel (int fuel)
{
	this.fuel=fuel;
	
}
public void fuel (float fuel, String vehiclestatus)
{
	this.fuel=fuel;
	this.vehiclestatus=vehiclestatus;
	
}
public void fuel (int fuel, char v )
{
	this.fuel=fuel;
	
	gasstatus=v;
	
}

abstract public void run();

abstract public void stop();
public int distance() {
	// TODO Auto-generated method stub
	return 90;
	
}
public int speed() {
	// TODO Auto-generated method stub
	return 12;
}

}

class twowheeler extends vehicle {
	
	long distance1; 
	int speed1;
	int nos_of_tires;
	
	
	twowheeler(){
		super.distance();
		super.speed();
		distance1= 400;
		speed1=100;
		nos_of_tires=2;
	}
	void display() {
		System.out.println(super.distance());
		System.out.println(super.speed());
		System.out.println(distance1);
		System.out.println(speed1);
		System.out.println("The number of tires is: "  + nos_of_tires);
		
	}
	
	
	 void run1() {
		System.out.println("Running in two wheeler");
	 }
 void stop1() {
	 System.out.println("Stopping in two wheeler");
	 
}
 @Override
 public void run() {
 	// TODO Auto-generated method stub
	 
	 System.out.println("Running in normal vehicle");
 	
 }
 @Override
 public void stop() {
 	// TODO Auto-generated method stub
	 System.out.println("Stopping in vehicle");
 	
 }
public static void main(String[] args) {
	
	
	 twowheeler obj = new twowheeler();
	 threewheeler obj1=new threewheeler();
	 fourwheeler obj2=new fourwheeler();
	 eightwheeler obj3=new eightwheeler();
	
	    obj.display();
		obj.stop();
		obj.run();
		obj.stop1();
		obj.run1();
		obj1.display1();
		obj1.stop2();
		obj1.run2();
		obj2.display2();
		obj2.stop3();
		obj2.run3();
		obj3.display3();
		obj3.stop4();
		obj3.run4();

		
		
}
 }
class threewheeler extends vehicle {
	
	long distance2; 
	int speed2;
	int nos_of_tires = 3;
	
	
	threewheeler(){
		super.distance();
		super.speed();
		distance2= 500;
		speed2=128;
	}
	void display1() {
		System.out.println(super.distance());
		System.out.println(super.speed());
		System.out.println(distance2);
		System.out.println(speed2);
		System.out.println("The number of tires is: " + nos_of_tires);
	}
	
	
	 void run2() {
		System.out.println("Running in three wheeler");
	 }
 void stop2() {
	 System.out.println("Stopping in three wheeler");
	 
}
 @Override
 public void run() {
 	// TODO Auto-generated method stub
	 
	 System.out.println("Running in normal vehicle");
 	
 }
 @Override
 public void stop() {
 	// TODO Auto-generated method stub
	 System.out.println("Stopping in vehicle");
 	
 }

}
class fourwheeler extends vehicle {
	
	long distance2; 
	int speed2;
	int nos_of_tires = 4;
	
	
	fourwheeler(){
		distance2= 600;
		speed2=140;
	}
	void display2() {
		System.out.println(distance2);
		System.out.println(speed2);
		System.out.println("The number of tires is: " + nos_of_tires);
	}
	
	
	 void run3() {
		System.out.println("Running in four wheeler");
	 }
 void stop3() {
	 System.out.println("Stopping in four wheeler");
	 
}
 @Override
 public void run() {
 	// TODO Auto-generated method stub
	 
	 System.out.println("Running in normal vehicle");
 	
 }
 @Override
 public void stop() {
 	// TODO Auto-generated method stub
	 System.out.println("Stopping in vehicle");
 	
 }

}


class eightwheeler extends vehicle {
	
	long distance3; 
	int speed3;
	int nos_of_tires = 8;
	
	
	eightwheeler(){
		distance3= 900;
		speed3=200;
	}
	void display3() {
		System.out.println(distance3);
		System.out.println(speed3);
		System.out.println("The number of tires is: " + nos_of_tires);
	}
	
	
	 void run4() {
		System.out.println("Running in eight wheeler");
	 }
 void stop4() {
	 System.out.println("Stopping in eight wheeler");
	 
}
 @Override
 public void run() {
 	// TODO Auto-generated method stub
	 
	 System.out.println("Running in normal vehicle");
 	
 }
 @Override
 public void stop() {
 	// TODO Auto-generated method stub
	 System.out.println("Stopping in vehicle");
 	
 }

}