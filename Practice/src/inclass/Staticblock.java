package inclass;

public class Staticblock {
	
		static int i= 10;
		static int j = 20;
		
		static 
		{
			System.out.println("Static block");
			System.out.println("i = "+i);
			m1();
		}
		
		public static void m1()
		{
			System.out.println("m1 method");
			System.out.println("j = "+j);
		}
		
		
		
		public static void main(String[] args) {
			System.out.println("main");
			System.out.println("j = "+j);
		}
		
}
