package Tricky_Java;

public class StringObjects {
	
	/* How many String objects will be created?
	 * 
	 * 3 Objects will be created */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1 = "Hello VINAY";
		String S2 = "Hello VINAY";
		String S3 = S1;
		
		String n1 = new String("Hello VINAY");
		String n2 = new String("Hello VINAY");
		
		System.out.println(S1 == S2);
		System.out.println(S2 == S3);
		System.out.println(S1 == S3);
		
		System.out.println(n1 == n2);
		System.out.println(S1 == n2);
		
		
		/*
		 
		 *  String s1 = "Hello VINAY" -->  only one object is created inside String pool
		 *  String n1 = new String("Hello VINAY") --> 2 object is created in String pool and in heap pool
		 
	    */

	}

}
