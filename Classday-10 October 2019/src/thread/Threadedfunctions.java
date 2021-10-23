package thread;



class Table{  
		  
		  synchronized void factorial (int number){//synchronized block  : this means to current context
			  System.out.println("I am in this method");
			 int factorial=1;

			for(int i=1;i<=number;i++)  
		     { 
		    	factorial= factorial*i;
		     }
			  System.out.println("The factorial is" +factorial);
		      try
		      {  
		       Thread.sleep(400);  
		      }
		      
		      catch(Exception e){
		    	  System.out.println(e);
		    	  }  
		     }
		     
		
		 
		 synchronized void sum(int n1, int n2)  
			     { 
			    	 System.out.println("I am in sum method");
			    	 System.out.println(n1+n2);
			     
			      try
			      {  
			       Thread.sleep(400);  
			      }
			      
			      catch(Exception e){
			    	  System.out.println(e);
			    	  }  
			     }
			       
		 } 
		  
		  
		class MyThread1 extends Thread{  
		Table t;  
		MyThread1(Table t){  
			this.t=t;  
		}  
		public void run(){  
			System.out.println("Into the MyThread1 run() method");
			t.factorial(4);  
		}  
		  
		}  
		class MyThread2 extends Thread{  
		Table t;  
		MyThread2(Table t){  
			this.t=t;  
		}  
		public void run(){  
			System.out.println("Into the MyThread2 run() method");
			t.factorial(6);  
		}  
		}  
		
		class MyThread3 extends Thread{  
			Table t;  
			MyThread3(Table t){  
				this.t=t;  
			}  
			public void run(){  
				System.out.println("Into the MyThread1 run() method");
				t.sum(4,5);  
			}  
			  
			}  
			class MyThread4 extends Thread{  
			Table t;  
			MyThread4(Table t){  
				this.t=t;  
			}  
			public void run(){  
				System.out.println("Into the MyThread2 run() method");
				t.sum(20,10);  
			}  
			} 
		  
		public class Threadedfunctions{  
		
		public static void main(String args[]){  
		
		Table obj = new Table();//only one object  
		
		MyThread1 t1=new MyThread1(obj);  
		MyThread2 t2=new MyThread2(obj);
		MyThread3 t3=new MyThread3(obj);  
		MyThread4 t4=new MyThread4(obj);
		
		t2.start();  
		t4.start(); 
		t1.start();  
		t3.start(); 
		}  
		}  



