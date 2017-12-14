package Practice;

import java.util.Scanner;

public class Q7MinMax {
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
		
		int min = arr[0],max = arr[0];
		
		for(int i = 1; i<n ; i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println("The minimum element is : "+min);
		System.out.println("The minimum element is : "+max);
	}
}
