package Exception;

public class A {
		int i = 90;
		public static void main(String[] args)
		{
			//System.out.println(i);
			
			try
			{
				A a = new A();
				System.out.println(a.i);
				
			}
			catch (Exception e) {
				A a = new A();// TODO: handle exception
			}
		}
}
