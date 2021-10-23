package vehicle;


class monkey {
	
	void jump() {
		System.out.println("Jumping");
	}

	void bite() {
		System.out.println("Biting");
	}

}

class human extends monkey{
	void eat() {
		System.out.println("Eating");
	}

	void sleep() {
		System.out.println("Sleeping");
	}
}


public class Examplehuman {
	public static void main(String args[]) {

		human b; // parent class reference

		b = new human(); // 2 --object of SBI CLass
		b.bite();
		b.jump();
		b.sleep();
		b.eat();
	
	}
	
	}