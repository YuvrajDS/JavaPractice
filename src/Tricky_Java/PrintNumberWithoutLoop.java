package Tricky_Java;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {

	/*	Print 1 to 100 without using any loop
    1. recursive function
    2. Java Streams */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		PrintNum(1);
		PrintNumber(1,100);
		
		IntStream.range(1, 101).forEach(a -> System.out.println(a));
	}
	
	public static void PrintNum(int num)
	{
		if(num<=100)
		{
			System.out.println(num);
			num++;
			PrintNum(num);
		}
	}
	
	public static void PrintNumber(int stNum, int endNum)
	{
		if(stNum <= endNum)
		{
			System.out.print(stNum);
			stNum++;
			PrintNumber(stNum,endNum);
		}
	}

}
