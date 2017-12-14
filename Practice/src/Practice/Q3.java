package Practice;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		
		System.out.println("\nEnter a no:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k=1;
		for(int i=1;k<n;i++)
		{
			for(int j=1; j<=i && k<=n ; j++,k++)
			{
				System.out.print(k+"\t");
			}
			System.out.println();
		}
	}
}
