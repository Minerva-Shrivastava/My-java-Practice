package Thread;


class Resource1
{
	public void m1()
	{
		System.out.println(Thread.currentThread().getName()+" Acquire m1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" Release m1");

	}
}
class Resource2
{
	public void m2() 
	{
		System.out.println(Thread.currentThread().getName()+" Acquire m2");
		try {
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" Release m2");

	}
}
class Thread1 extends Thread
{
	Resource1 r1;
	Resource2 r2;
	
	Thread1(Resource1 r1, Resource2 r2)
	{
		this.r1 = r1;
		this.r2 = r2;
	}
	
	public void run()
	{
		synchronized(r1)
		{
			r1.m1();
			synchronized(r2)
			{
				r2.m2();
			}
		}
		System.out.println("t1 compleates it's execution");
	}

}

class Thread2 extends Thread
{
	Resource1 r1;
	Resource2 r2;
	
	Thread2(Resource1 r1, Resource2 r2)
	{
		this.r1 = r1;
		this.r2 = r2;
	}
	
	public void run()
	{
		synchronized(r2)
		{
			r2.m2();
			synchronized(r1)
			{
				r1.m1();
			}
		}
		System.out.println("t2 compleates it's execution");
	}
}


public class Deadlock {

	public static void main(String[] args) {
		Resource1 r1 = new Resource1();
		Resource2 r2 = new Resource2();
		
		Thread1 t1 = new Thread1(r1, r2);
		Thread1 t2 = new Thread1(r1, r2);
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		t2.start();
	}
}
