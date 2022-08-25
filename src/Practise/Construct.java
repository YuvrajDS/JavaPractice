package Practise;

public class Construct {
	
	
	public Construct()
	{
		System.out.println("Default Constructor");
	}

	public Construct(int a,int b)
	{
		System.out.println("Parameterized Default Constructor");
		int c=a+b;
		System.out.println(c);
	}
	
	public Construct(String Str)
	{
		System.out.println("String Parameterized Default Constructor");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Construct CD=new Construct();
		Construct C1=new Construct(4,5);
		Construct C2=new Construct("Java");
	}

}
