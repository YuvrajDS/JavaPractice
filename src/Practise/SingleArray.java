package Practise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SingleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[][]= {{2,4,5},{3,0,7},{1,2,9}};
		int min=a[0][0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]>min)
				{
					min=a[i][j];
				}
				
				
			}
		}
		System.out.println(min);
		
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/d/M");
		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy mm:hh:ss");
		
		
		System.out.println(d.toString());
		System.out.println(sdf.format(d));
		System.out.println(sd.format(d));
		
	}
}

