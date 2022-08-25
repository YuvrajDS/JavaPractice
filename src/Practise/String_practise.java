package Practise;

import java.io.IOException;

public class String_practise {
	

	public static void getdata()
	{
		String a="BangaloreCityCorporation";
		System.out.println(a);
	}

	public static void main(java.lang.String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String_practise ab=new String_practise();
		ab.getdata();
		
	/*	String a="BangaloreC ityCorporation";
		System.out.println(a.charAt(5));
		System.out.println(a.indexOf("a"));
		System.out.println(a.substring(3,6));
		System.out.println(a.concat("STR"));
		System.out.println(a.length());
		System.out.println(a.trim());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		String[] s=a.split("a");
		System.out.println(a.replace("a", "z"));*/
		
		
		
		
		String a= "123457890";
		
		isnumber(a);
		
		
		int c=ab.add(1,2);
		int f=c-1;
		
	
        
		
	}

	
	public static boolean  isnumber(String s) {
		
		try {
		Integer.parseInt(s) ;
		
		System.out.println("its a number");
		}catch (Exception e) {
			System.out.println("It is not a number");
			
		}
		return false;
	}
		
/*	
public static void  Verifynumber(String s) {
		
	if(s.length() == 10)
	{
		System.out.println("Mobile phone");
	}
	
	else if(s.length()==16)
	{
		System.out.println("Credit Card Number");
	}
		
	}    */


public static void  Verifynumber(String X) {
	
	if(X.length() == 10)
	{
		System.out.println("Mobile phone");
	}
	
	else if(X.length()==16)
	{
		System.out.println("Credit Card Number");
	}
		
	}


public  int add(int a,int b) {
	System.out.println(a+b);
	int c=a+b;
	return c;
}



	
}
