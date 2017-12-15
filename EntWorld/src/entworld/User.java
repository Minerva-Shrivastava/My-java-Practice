/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entworld;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
/**
 *
 * @author Minerva
 */
public class User implements List{
    
    String name,email;
	long mob_no;
	Float balance;
	
	Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList();
        //JDBC db = new JDBC();
        
        
        User(String name , String email , Float balance , long mob_no)
	{
		System.out.println("Thank you for registering");
		this.name = name;
		this.email = email;
		this.mob_no = mob_no;
		this.balance = balance;
                //db.register(name, email, mob_no, balance);
                Mail m = new Mail(this.email, this.name);
        }
	
		
	public void mobrech()
	{
		System.out.println("Enter service ID");
		String ser = sc.next();
		System.out.println("Enter recharge amount");
		float rec = sc.nextFloat();
		if(balance<rec)
		{
			System.out.println("You don't have enough balance");
		}
		else
		{
			balance -= rec;
			System.out.println("Reacharge is done of amount :" + rec);
			System.out.println("Remaining balance is :" + balance);
                        /*al.add(0, new Date());
                        al.add(1, name);
                        al.add(2, "Mobile_recharge");
                        al.add(3, rec);
                        al.add(4, balance);
                        while(it.hasNext())
                        {
                            System.out.println(it.next());  
                        }*/
//			db.transaction(name, "Mobile_Recharge", rec, balance);
		}
		
	}
	
	public void Movietic()
	{ 
		System.out.println("Enter Movie name");
		String mov = sc.next();
		System.out.println("Enter price of the movie");
		float price = sc.nextFloat();
		if(balance<price)
		{
			System.out.println("You don't have enough balance");
		}
		else
		{
			balance -= price;
			System.out.println("Ticket is booked of price:"+price);
			System.out.println("Remaining balance is :" + balance);
//			db.transaction(name, "Movie Ticket", price, balance);
		}
		
	}

	public void trans()
	{
		//db.veiwTrans();
	}

	public void addmoney()
	{
		System.out.println("Enter the amount you want to add");
                float amount = sc.nextInt();
                balance += amount;
                System.out.println("Balance mow becomes:"+ balance);
//		db.transaction(name, "Add money", amount, balance);
	}

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Object e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void add(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
