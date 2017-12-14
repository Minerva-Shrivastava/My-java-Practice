package Practice;

import java.util.Scanner;

public class Q1switchcasedemo {
	public static void main(String[] args) {
		int r = 0;
		System.out.println("\nEnter a no:");
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		
		int m = Integer.parseInt(n) ;
		int a;
		while(m!=0)
		{
			a = m%10;
			r = r*10+a;
			m = m/10;
		}
		//System.out.println(r);
		
		System.out.println(n);
			if(n.charAt(0)=='0')
				{
					r *= 10;
				}
			
		
		
		while(r!=0)
		{	//System.out.println(r);
			int b = r%10;
			//System.out.println(b);
			
			switch(b)
			{
			case 0 : System.out.print("Zero ");
					 break;
			case 1 : System.out.print("One ");
			 		 break;
			case 2 : System.out.print("Two ");
			 		 break;
			case 3 : System.out.print("Three ");
			 		 break;
			case 4 : System.out.print("Four ");
			 		 break;
			case 5 : System.out.print("Five ");
			 		 break;
			case 6 : System.out.print("Six ");
			 		 break;
			case 7 : System.out.print("Seven ");
			 		 break;
			case 8 : System.out.print("Eight ");
			 		 break;
			case 9 : System.out.print("Nine ");
			 		 break;
			}
			r = r/10;
		}	
	}
}
