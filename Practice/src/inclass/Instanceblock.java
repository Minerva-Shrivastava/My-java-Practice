package inclass;

public class Instanceblock {
		
	int i= 10;
	 
	static 
	{
		System.out.println("Static block");
		//System.out.println("i = "+i);
		//m1();
	}
	
	{
		System.out.println("Instance block");
		System.out.println("i = "+i);
		m1();
	}
	
	public  void m1()
	{
		System.out.println("m1 method");
		System.out.println("j = "+j);
	}
	
	Instanceblock()
	{
		System.out.println("Constructor");
	}
	
	int j = 20;
	
	public static void main(String[] args) {
		System.out.println("main");
		Instanceblock a = new Instanceblock();
		Instanceblock b = new Instanceblock();
	}
}
