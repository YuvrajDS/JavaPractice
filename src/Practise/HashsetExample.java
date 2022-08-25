package Practise;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> HS = new HashSet<String>();
		HS.add("USA");
		HS.add("CHINA");
		HS.add("TAIWAN");
		HS.add("He");
		HS.add("SHE");
		HS.add("INDIA");
		System.out.println(HS);
		//System.out.println(HS.remove("TAIWAN"));
		System.out.println(HS.isEmpty());
		System.out.println(HS.size());
		
		Iterator<String> i = HS.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
