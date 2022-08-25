package Tricky_Java;

import java.util.Arrays;
import java.util.BitSet;

public class PrintNumwithoutLoopandRecursion {
	
	//Print from 1 to 100 without using loop and recursion

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	1. Array Fill method
		
		Object num[] = new Object[100];
		
		Arrays.fill(num, new Object()
		{
			int count = 0;
			//@0verride
			public String toString()
			{
				return Integer.toString(++count);
			}
			
		});
		
		System.out.println(Arrays.toString(num));
		
		System.out.println();
		
		//2. Bitset Method
		
		String set = new BitSet()
				{
			{set(1,101);}
				}.toString();
		
        System.out.append(set, 1, set.length());
	}

}



