package Thread;

public class Prioritymain {

		public static void main(String[] args) throws InterruptedException{
			Priority p1 = new Priority();
			Priority p2 = new Priority();
			Priority p3 = new Priority();
			
			p1.setPriority(2);
			p1.setPriority(5);
			p1.setPriority(3);
			
			Thread.currentThread().setPriority(10);
			
			p1.start();
			p2.start();
			p3.start();
			
			Thread.sleep(10000);
			
			p1.running = false;
			p2.running = false;
			p3.running = false;
			
			p1.join();
			p2.join();
			p3.join();
			
			System.out.println(p1.count);
			System.out.println(p2.count);
			System.out.println(p3.count);
		}
}
