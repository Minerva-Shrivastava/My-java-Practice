package inclass;

public class MethodOver {
	
		public void m1(int x)
		{
			System.out.println("int-arg");
		}
		public void m1(long x)
		{
			System.out.println("Long-arg");
		}
		public void m1(float x)
		{
			System.out.println("float-arg");
		}
		
		
		//2nd case
		
		public void m1(float x,int y)
		{
			System.out.println("float-int");
		}
		public void m1(int x,float y)
		{
			System.out.println("int-float");
		}
		
		//3nd case
		
				public void m1(Object o)
				{
					System.out.println("Object-arg");
				}
				public void m1(String s)
				{
					System.out.println("String-arg");
				}
				
		/*//case 4
				public void m1(StringBuffer s)
				{
					System.out.println("String-arg");
				}
				
		*/		
		
				public void m1(int...x)
				{
					System.out.println("var-arg");
				}
		
		public static void main(String[] args) {
			MethodOver a = new MethodOver();
			a.m1(10,10.5f);
			a.m1(10.5f,10);
			a.m1(new Object());
			a.m1("Ashish");
			//a.m1(null);
			a.m1(10,20,30);
		}
}
