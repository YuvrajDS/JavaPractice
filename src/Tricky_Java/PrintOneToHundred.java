package Tricky_Java;

public class PrintOneToHundred {

	//Print 1 to 100 without using any number in the code
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Method 1
//		
//		for(int i=1;i<=100;i++)
//		{
//			System.out.println(i);
//		}
		
		
//		Method 2
		
		int one = 'A'/'A';
	String S1 = "..........";
	
//	Method 2
//		
//		for(int i=one; i<= (S1.length() * S1.length() );i++)
//             {
//	                System.out.println(i);
//             }
		
//		Method 3 - Ascii Value -- a-97, b-98, c-99, d-100
		
		for(int i=one;i<='d';i++)
		{
			System.out.println(i);
		}

	}

}
