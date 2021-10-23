package thread;


	class Customer{  
		int amount=10000;  
		  
			synchronized void withdraw1(int amount){  
			System.out.println("going to withdraw...");  
			  
				if(this.amount<amount)
				{  
				System.out.println("Less balance; waiting for deposit...");  		 
				}  
				this.amount-=amount;  
				System.out.println("withdraw completed...the lefft over amount is"+ this.amount);  
			} 
			
			synchronized void withdraw2(int amount){  
				System.out.println("going to withdraw...");  
				  
					if(this.amount<amount)
					{  
					System.out.println("Less balance; waiting for deposit...");  		 
					}  
					this.amount-=amount;  
					System.out.println("withdraw completed...the lefft over amount is"+ this.amount);  
				}  
		  
			synchronized void withdraw3(int amount){  
				System.out.println("going to withdraw...");  
				  
					if(this.amount<amount)
					{  
					System.out.println("Less balance; waiting for deposit...");  		 
					 
					try{
						wait();
					   }
					catch(Exception e){}  
					}  
					this.amount-=amount;  
					
					System.out.println("withdraw completed...the lefft over amount is"+ this.amount);  
				}  
			synchronized void deposit(int amount){ 
				if(this.amount<amount) {
				System.out.println("going to deposit...");  
				this.amount+=amount;  }
				
				System.out.println("deposit completed... " + this.amount);  
				notify();  //unlocking of thread
			}  
		}  
		  
		public class WithdrawDeposit{  
			public static void main(String args[]){  
				final Customer c=new Customer();  
				
				new Thread(){                 // anonymous class
				  public void run()
				  {
					c.withdraw1(5000);
					c.withdraw2(4000);
					c.withdraw3(10000);
				  }  
				}.start();  
				
				new Thread(){  
				  public void run()
				   {
					 c.deposit(20000);
				   }  
				}.start();    
			}}


