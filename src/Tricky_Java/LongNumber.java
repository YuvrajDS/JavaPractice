package Tricky_Java;

public class LongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long longNumberwithoutL = 1000*60*60*24*365;
		long longNumberwithL = 1000*60*60*24*365L;
		
		
		System.out.println(longNumberwithoutL);
		System.out.println(longNumberwithL);
		
		//31536000000 -- 36 bits
		//11101010111101100010010110000000000
		// Max limit of 32 bit int: 2147483647
		
		//1010111101100010010110000000000 ---> 1471228928
		

	}

}
