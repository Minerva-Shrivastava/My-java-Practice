package Practice;

import java.util.Scanner;

public class Q4 {
public static void main(String[] args) {
		
		
		System.out.println("\nEnter a no:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=i ; j++)
			{
				count++;
				if(count%2==0)
				{
					System.out.print("1\t");
				}
				else
				{
					System.out.print("0\t");
				}
			}
			System.out.println();
		}
	}
}
