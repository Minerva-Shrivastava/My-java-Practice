package Thread;

public class JoinT2 extends Thread {
	
	JoinT1 t1;
	
	JoinT2(JoinT1 t)
	{
		this.t1 = t;
		
	}
	
	public void run()
		{
			try {
				t1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(int i = 11; i<=20; i++)
			{
				System.out.println(i);
			}
		}
}
