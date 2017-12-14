package Thread.Synchronization;

public class Account  {
	
		int accno,balance;
		String name;
		
		
		Account(int accno,String name, int balance)
		{
			this.accno = accno;
			this.name = name;
			this.balance = balance;
		}
		
		 public void deposit(int amount) throws InterruptedException
		{
			int local = balance;
			local += amount;
			Thread.sleep(500);
			balance = local;
		}
		
		public void withdraw(int amount) throws InterruptedException
		{
			int local = balance;
			if(local >= amount)
			{
				local -= amount;
					
			}
			balance  = local;
			Thread.sleep(500);
		}
		
		public void enquiry()
		{
			System.out.println("balance = "+balance);
		}
		
}



