package Practise;

import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {4,5,6,5,5,8,3,4,6,4,1,7};
		
		ArrayList<Integer> ab = new ArrayList<Integer>();
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			
			if(!ab.contains(a[i]))
			{
				ab.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++)
				{
					if (a[i] == a[j])
					{
					   k++;
					}
					
				}
				
			}
			System.out.println(a[i]);
			System.out.println(k);
		}
		
		

	}

}
