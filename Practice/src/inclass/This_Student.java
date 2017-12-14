package inclass;

public class This_Student {
	int rollno ;
	String name;
	
	/*This_Student(int rollno, String name)
	{
		rollno = rollno;
		name = name;
	}*/
	
	This_Student(int rollno, String name)
	{
		this.rollno = rollno;
		this.name = name;
	}

	public void show()
	{
		System.out.println("name = "+name+" "+"rollno = "+rollno);
	}
	
	public static void main(String[] args) {
		This_Student s = new This_Student(101,"Amit");
		s.show();
	}
}
