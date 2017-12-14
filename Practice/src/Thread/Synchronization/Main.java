package Thread.Synchronization;

public class Main {

		public static void main(String[] args) {
			Account a = new Account(99,"minu",9000);
			
			//Two Threads
			Bank b = new Bank(a);
			ATM a1 = new ATM(a);
			
			b.start();
			a1.start();
			
		}
}
