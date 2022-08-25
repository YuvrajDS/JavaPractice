package Tricky_Java;

public class Staticblock {
	
	/* will static block be executed with final variable */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Main.x);

	}

}

class Main
{
	public static final int x=100;
	
	static
	{
		System.out.println("main --- class static block...");
	}
}