package thread;


public class threading extends Thread{

	public void run() {
		
		for(int i=0;i<5;i++) {
			
			try {
			Thread.sleep(2000);
			}
			catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName()+ " :" +i);
					
		}
		
	}
	
	public static void main(String args[]) {
		
		
		 threading t1=new threading();  
		  t1.setName("Java");
		  t1.setPriority(MAX_PRIORITY); 
		  
		  threading t2=new threading();  
		  t2.setName("Python");
		  
		  threading t3=new threading(); 
		  t3.setName("Oracle");
		  
		  threading t4=new threading(); 
		  t4.setName("C++");
		   
		  t1.start();  
		  t2.start();  
		  t3.start();
		  t4.start();
		  
		  System.out.println(t1.getState());
		  System.out.println(t3.getState());
		  System.out.println(t2.getState());
		 }  
		
	}

