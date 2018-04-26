package Practice;

import java.util.Scanner;

public class Q10 {
	
public static void main(String[] args) {
		
		
		System.out.println("\nEnter a no:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=i ; j++)
			{
				System.out.print(i+"\t");
			}
			System.out.println("\n");
		}
	}
}
