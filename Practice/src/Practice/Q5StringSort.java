package Practice;

import java.util.Scanner;

public class Q5StringSort {
	public static void main(String[] args) {
		System.out.println("\nHow many names do you want to enter?");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		System.out.println("Enter the names:");
		for(int i = 0; i<arr.length ; i++)
		{
			arr[i] = sc.next();
		}
		
		String temp = null;
		
		for(int i = 1 ; i<arr.length ; i++)
		{
			int k = 0;
			for(int j = i-1; j<arr.length && k<arr[i].length() && k<arr[j].length();j++)
			{				
				//System.out.println("posi:"+i+" value:"+arr[i]+" posj:"+j+" value:"+arr[j]);
				
				if(arr[i].charAt(k) < arr[j].charAt(k))
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				if(arr[i].charAt(k) == arr[j].charAt(k))
				{
					k++;
				}
			}
		}
		
		for(int i = 0; i<arr.length ; i++)
		{
			System.out.println(arr[i]+" ");
		}
		
	}
}
