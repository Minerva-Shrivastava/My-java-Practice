package Thread;

public class JoinMain {
	
		public static void main(String[] args) throws InterruptedException {
			JoinT1 t1 = new JoinT1();
			JoinT2 t2 = new JoinT2(t1);
			JoinT3 t3 = new JoinT3(t2);
			
			t1.start();
			t2.start();
			t3.start();
			
			t2.join();
			
			for(int i=31;i<=40;i++)
			{
				System.out.println(i);
			}
			
		}
}
