package Practice;

import java.util.Scanner;

public class Q11Palindrome {
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
		
		
		//System.out.println(n);
			if(n.charAt(0)=='0')
				{
					r *= 10;
				}
		System.out.println("Reverse of the no is : " +r);
		if(Integer.parseInt(n)==r)
		{
			System.out.println("No is a Palindrome");
		}
		else
		{
			System.out.println("No is not a Palindrome");
		}
		
	}
}
