package Thread;

public class InterThreadComm {
	public static void main(String[] args) {
		Table t = new Table();
		
		Threadtbl2 t2 = new Threadtbl2(t);
		Threadtbl3 t3 = new Threadtbl3(t);
		Threadtbl4 t4 = new Threadtbl4(t);
		
		t2.start();
		t3.start();
		t4.start();
		
	}
}

class Table
{
	
	int mutex = 2;
	
	synchronized public void m2()
	{
		System.out.println("Mutex is : "+mutex);	
				
			for(int i = 1; i<=10 ; i++)
			{
				while(mutex != 2)
				{
					try {
							this.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
			
				System.out.println("\n2*"+i+" = "+2*i);
				mutex = 3;
				this.notifyAll();
			}
	}
			
	
	
	synchronized public void m3()
	{
		System.out.println("Mutex is : "+mutex);	
		
		for(int i = 1; i<=10; i++)
		{
			while(mutex != 3)
			{
				try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		
			System.out.println("\n3*"+i+" = "+3*i);
			mutex = 4;
			this.notifyAll();
		}
	}
	
	synchronized public void m4()
	{
		System.out.println("Mutex is : "+mutex);	
		
		for(int i = 1; i<=10; i++)
		{
			while(mutex != 4)
			{
				try {
						this.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		
			System.out.println("\n4*"+i+" = "+4*i);
			mutex = 2;
			this.notifyAll();
		}
	}
}


class Threadtbl2 extends Thread
{
	Table t;
	
	Threadtbl2(Table t)
	{
		this.t = t;
	}
	
	public void run()
	{
		t.m2();
	}
}

class Threadtbl3 extends Thread
{
	Table t;
	
	Threadtbl3(Table t)
	{
		this.t = t;
	}
	
	public void run()
	{
		t.m3();
	}
}

class Threadtbl4 extends Thread
{
	Table t;
	
	Threadtbl4(Table t)
	{
		this.t = t;
	}
	
	public void run()
	{
		t.m4();
	}
}