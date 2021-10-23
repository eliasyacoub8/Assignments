package Classday2;

abstract class studentMarks {

	abstract int getPercentage();
}

public class A extends studentMarks{
	public int getPercentage1(int subject1,int subject2,int subject3) {
		int totalpercentage= (subject1+subject2+subject3)/3;
		return totalpercentage;
	
	}

	@Override
	public int getPercentage() {
		return 0;
		// TODO Auto-generated method stub
		
	}

	
	public static void main(String args[]) {
	
		A student1=new A();
		
		
		System.out.println(student1.getPercentage1(56,89,100));
		
			B student2=new B();
		
		
		System.out.println(student2.getPercentage2(56,89,100,89));
		
		
		
	}
}

class B extends studentMarks{
	public int getPercentage2(int subject1,int subject2,int subject3,int subject4) {
		int totalpercentage2= (subject1+subject2+subject3+subject4)/4;
		return totalpercentage2;
	}

	@Override
	public int getPercentage() {
		return 0;
		// TODO Auto-generated method stub
		
	}
}



