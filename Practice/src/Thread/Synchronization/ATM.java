package Thread.Synchronization;

public class ATM extends Thread{
	
		Account a;
		
		ATM (Account a)
		{
			this.a = a;
		}
		public void run()
		{
			a.enquiry();
			try {
				a.withdraw(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			a.enquiry();
		}
		
}
