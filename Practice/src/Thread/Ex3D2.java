package Thread;

public class Ex3D2 extends Ex3D1{
	public void start()
	{
		System.out.println("start");
	}
	public void run()
	{
		for(int i = 1000;i<2000;i++)
		{
			System.out.println("D2:"+i);
		}
	}
}
