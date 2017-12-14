package Thread.Synchronization;

public class Bank extends Thread{
	Account a;
	
	Bank (Account a)
	{
		this.a = a;
	}
	public void run()
	{
		a.enquiry();
		try {
			a.deposit(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		a.enquiry();
	}
}

