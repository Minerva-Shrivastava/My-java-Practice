package Thread;

public class JoinT3 extends Thread{

	JoinT2 t2;
	
	JoinT3(JoinT2 t2)
	{
		this.t2 = t2;
	}
	
	public void run()
	{
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 21; i<=30; i++)
		{
			System.out.println(i);
		}
	}
}

