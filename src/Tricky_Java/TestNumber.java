package Tricky_Java;

public class TestNumber {
	
	//Compare 2 integer Number(Integer caching)
	
	/*Reason is Integer Caching Range is -128 to  , within this
	  range if we compare it will correct output*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer num1 = 199;
		Integer num2 = 199;
		
		if(num1 == num2)
		{
			System.out.println("Both are Equal");
		}
		else
		{
			System.out.println("Both are NOT Equal");
			
		}
		
	}

}
