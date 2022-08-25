package Practise;

//public class Practo {
//
//	//1. Print from 1 to 100 without using any numbers in your code
//	
//	public void PrintNum()
//	{
//		int one='A'/'A';
//		System.out.println("i value is "+one);
//		
//		String s1="..........";
//		System.out.println("lenght is "+s1.length());
//		
//		for(int i=one; i<=(s1.length() * s1.length()); i++)
//		{
//			System.out.println(i);
//		}
//		
//        for(int i=one;i<='d';i+=one)
//        {
//        	System.out.println(i);
//        }
//	}
//	
//	//2. Print 1 to 100 Without Using for/while/do-while Loop in Code || Using Recursive
//
//	public static void PrintNumber1(int num)
//	{
//		if (num<=100)
//		{
//			System.out.println(num);
//			num++;
//			PrintNumber1(num);
//		}
//	}
//	
//	public static void PrintNumber2(int Stnum,int Endnum)
//	{
//		if (Stnum<=Endnum)
//		{
//			System.out.println(Stnum);
//			Stnum++;
//			PrintNumber2(Stnum,Endnum);
//		}
//	}
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Practo Obj1=new Practo();
//		Obj1.PrintNumber1(1);
//		Obj1.PrintNumber2(1,500);
//		
//		double a, b;
//		a=3.0;
//		b=4.0;
//		double c=Math.sqrt(a*a+b*b);
//		System.out.println(c);
//	}
//
//}


import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class Practo {    
  public static void main(String[] args) {    
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now));  
  }    
} 
