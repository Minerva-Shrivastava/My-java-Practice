package Practice;

import java.util.Scanner;

public class Q6Sort {
	public static void main(String[] args) {
		System.out.println("Enter the size of array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int temp=0;
		
		for(int i = 1; i<n ; i++)
		{
			for(int j = 0 ; j<n ; j++)
			{
				if(arr[i]<arr[j])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("The sorted array is:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
