package Practice;

import java.util.Scanner;

public class Q2EvenOdd {
	
	public static void main(String[] args) {
		
		System.out.println("\nEnter two nos");
		Scanner sc = new Scanner(System.in);
		int n1,n2;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		int count=0,sum=0,sum1=0,count1=0;
		for(int i = n1;i<=n2;i++)
		{
			if(i%2 == 0)
			{
				System.out.print(i+" ");
				sum += i;
				count++;
			}
		}
		
		float avg = sum/count;
		System.out.println("\n Avg of even nos is : "+ avg);
		
		for(int i = n1; i<=n2; i++)
		{
			if(i%2 != 0)
			{	
				System.out.print(i+" ");
				sum1 += i;
				count1++;
			}
		}
		
		float avg1 = sum1/count1;
		System.out.println("\n Avg of odd nos is : "+ avg1);
	}	
	
	
}
