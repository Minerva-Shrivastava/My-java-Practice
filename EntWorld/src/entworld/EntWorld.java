/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entworld;


import java.util.Scanner;
import java.util.regex.Pattern;
/**
 *
 * @author Minerva
 */
public class EntWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\t\t\t\t Welcome to Entertainment World");
	
		System.out.println("\n \n If you are an existing user press 1 otherwise 0");
		Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
		String name=null, email=null;
		char z;
		boolean b;
		long mob=0;
		float bal=0;
		
                switch(x)
                {
                    case 1: System.out.println("checking Database");
							break;
                    case 0: System.out.println("Enter your details for registration");
					
                    		do
                           {
                                System.out.println("Enter your name");
                                name = sc.next();
                                b = Pattern.matches("^[a-zA-Z\\s]+$", name);
                                System.out.println(b);
                                if(b == false)
                                System.out.println("name should have only charcters, enter name again");
                            }while(b == false);
			
							do
							{
								System.out.println("Enter your Email ID");
				                                email = sc.next();
								b = Pattern.matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$", email);
								System.out.println(b);
								if(b == false)
								System.out.println("Enter correct format");
							}while(b == false);
					
							do
				        		{
				                                System.out.println("Enter your Mobile no.");
				                                String mob1 = sc.next();
				                                b = Pattern.matches("^[1-9]{1}[0-9]{9}$", mob1);
								System.out.println(b);
				                                mob = Long.parseLong(mob1);
								if(b == false)
								System.out.println("Enter correct format");
							}while(b == false);
									
							do
							{
								System.out.println("Enter your Balance");
				                                String bal1 = sc.next();
								b = Pattern.matches("^\\d+(,\\d+)*$", bal1);
								System.out.println(b);
				                                bal = Integer.parseInt(bal1);
								if(b == false)
								System.out.println("Enter correct format");
							}while(b == false);
				                                        
				            break;
				                                
				    default:System.out.println("Choose a correct option");
				}			
		
		User u1 = new User(name, email, bal, mob);
		
		do
		{
				System.out.println("\nChoose a service:\n 1.Mobile Recharge \n 2.Movie ticket \n 3.View Transactions \n 4.Add money \n 5.Exit");
				int s = sc.nextInt();
				switch(s)
				{
					case 1: u1.mobrech();
							break;
					case 2: u1.Movietic();
					 		break;
					case 3: u1.trans();
							break;
					case 4: u1.addmoney();
							break;
                                        case 5: System.exit(s);
                                
                               
				}
				
				System.out.println("Do you want to continue?Y/N");
				z = sc.next().charAt(0);
			
		}while(z == 'y' || z == 'Y');	
        
    }
}
