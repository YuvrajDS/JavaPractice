package Tricky_Java;

public class DoubleMinValue {
	
	/* 1. what is the value of double Min_Value?
	   2. which one is bigger --> Double Min_value or 0.0d?
	   3. which one is bigger --> Double Min_value or NEGATIVE_INFINITY?
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Float.MIN_VALUE + "\n"); 
		
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println(Math.min(Long.MIN_VALUE, 0.0d));
		System.out.println(Math.min(Integer.MIN_VALUE, 0.0d));
		System.out.println(Math.min(Float.MIN_VALUE, 0.0d) + "\n");
		
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));

	}

}
