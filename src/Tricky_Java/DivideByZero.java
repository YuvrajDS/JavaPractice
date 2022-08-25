package Tricky_Java;

public class DivideByZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(9.0/0);         //Infinity
		System.out.println(12.33f/0);      //Infinity
		System.out.println(10/0.0);        //Infinity
		System.out.println(19.9999d/0);    //Infinity
		//System.out.println(0/0);         //Arithmetic Exception
		System.out.println(0.0/0);         //NaN
		System.out.println(0.0/0.0);       //NaN
		System.out.println(89.999/0.0);    //Infinity

	}

}
