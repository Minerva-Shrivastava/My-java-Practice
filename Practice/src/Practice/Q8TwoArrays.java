package Practice;

import java.util.Scanner;

public class Q8TwoArrays {
	public static void main(String[] args) {
			System.out.println("Enter the size of array1:");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter the array:");
			for(int i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the size of array2:");
			int n2 = sc.nextInt();
			int[] arr2 = new int[n2];
			System.out.println("Enter the array:");
			for(int i=0;i<n2;i++)
			{
				arr2[i]=sc.nextInt();
			}
			
			int count = 0;
			
			for(int i = 0; i<arr.length ;i++)
			{
				for(int j = 0; j<arr2.length ; j++)
				{
					
					if(arr[i]%arr2[j] == 0)
					{
						
						count++;
					}
				}
				
			}
			 
			System.out.println("The no of divisions possible were :"+count);
	}
}
