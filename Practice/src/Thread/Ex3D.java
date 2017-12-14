package Thread;

public class Ex3D {
	public static void main(String[] args) {
		Ex3D1 d1 = new Ex3D1();
		d1.run();
		d1.start();
		//d1.start();
		//Ex3D1 d2 = new Ex3D1();
		//d1.run();
		//d2.start();
		
		System.out.println("-----");
		Ex3D2 d3 = new Ex3D2();
		d3.start();
		for(int i = 2000; i<3000;i++)
		{
			System.out.println(i);
		}
	}
}
