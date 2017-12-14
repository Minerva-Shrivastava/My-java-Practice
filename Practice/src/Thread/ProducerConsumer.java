package Thread;

public class ProducerConsumer {

	public static void main(String[] args) {
		Resource r1 = new Resource();
		
		Producer p1 = new Producer(r1);
		
		Consumer c1 = new Consumer(r1);
		
		p1.start();
		c1.start();
	}
	
	
		
		
}

class Resource
{
	int count = 0;
	boolean mutex = false;
	
	public void produce()
	{
		while(mutex != false)
		{
			synchronized(this)
			{
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		++count;
		System.out.println("\nProducer produce : "+ count);
		mutex = true;
		synchronized(this)
		{
			this.notify();
		}
	}
	
	
	public void consume()
	{
		while(mutex != true)
		{
			synchronized(this)
			{
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		System.out.println("\nConsumer consume : "+ count);
		mutex = false;
		synchronized(this)
		{
			this.notify();
		}
	}
	
}

class Producer extends Thread
{
	Resource p;
	
	Producer(Resource p)
	{
		this.p = p;
	}	
	
	public void run()
	{
		while(true)
		{
			p.produce();
		}
	}
}


class Consumer extends Thread
{
	Resource p;
	
	Consumer(Resource p)
	{
		this.p = p;
	}	
	
	public void run()
	{
		while(true)
		{
			p.consume();
		}
	}
}