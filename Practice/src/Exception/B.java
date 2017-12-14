package Exception;

public class B {
	static void test() throws ClassNotFoundException
	{
		Class.forName("A.class");
	}
	public static void main(String[] args) {
		try
		{
			test();
		}
		catch (ClassNotFoundException e) {
			System.out.println(e);// TODO: handle exception
		}
		catch (VirtualMachineError e) {
			// TODO: handle exception
		}
	}
}
