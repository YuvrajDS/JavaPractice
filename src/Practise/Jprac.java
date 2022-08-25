package Practise;



public class Jprac {

	public void getdata() {
		String X="Helloworld";
		
		String a="helloworld";
		System.out.println(a.charAt(5));
		System.out.println("I am in a method");
	}

	static int a = 5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	
	Jprac AB = new Jprac();
		AB.getdata();

		System.out.println(a); // print a Variable
		System.out.print("Hai"); // print a String.
		System.out.println("ABCD");
		AB.getdata();
		
       int k=3;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k=k+3;
				
			}
			System.out.println("");

			}
		
			  
			   
		}
	


	

		
	}

