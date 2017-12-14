package Thread;

public class Ex2B {
	public static void main(String[] args) {
			Ex2 e = new Ex2();
			e.start();
			for(int i=1000;i<2000;i++)
			{
				System.out.println(i);
			}
	}
	
}
