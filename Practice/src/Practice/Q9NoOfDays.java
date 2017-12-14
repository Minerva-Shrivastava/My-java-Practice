package Practice;

import java.util.Scanner;

public class Q9NoOfDays {
		
		public static void main(String[] args) {
			System.out.println("\nEnter the no of days: ");
			Scanner sc = new Scanner(System.in);
			int days = sc.nextInt();
			int months = days/30;
			int days1 = days%30;
			System.out.println("No of months : "+months+" and days : "+ days1);
		}
}
