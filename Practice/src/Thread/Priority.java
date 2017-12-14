package Thread;

public class Priority extends Thread{

		long count;
		volatile boolean running = true;
		public void run()
		{
			while(running)
			{
				++count;
			}
		}
		
}
