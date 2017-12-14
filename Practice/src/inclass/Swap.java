package inclass;

public class Swap {
	 
	int num1 ;
	int num2 ;
	
	public void SwapByValue(int x, int y)
	{
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("x = "+x+" y = "+y);
	}
	
	public void SwapByReference(Swap s)
	{
		int temp;
		temp = s.num1;
		s.num1 = s.num2;
		s.num2 = temp;
	}
	
	public static void main(String[] args) {
		Swap s = new Swap();
		
		s.num1 = 10;
		s.num2 = 20;
		
		s.SwapByValue(s.num1, s.num2);
		System.out.println("num1 = "+s.num1+" num2 = "+s.num2);
		
		s.SwapByReference(s);
		System.out.println("num1 = "+s.num1+" num2 = "+s.num2);
		
	}
}
