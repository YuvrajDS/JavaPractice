package Practise;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> HM = new HashMap<Integer, String>();
		HM.put(0, "Kiribati");
		HM.put(9, "ukrine");
		HM.put(23, "Lohanas");
		HM.put(7, "donesks");
		System.out.println(HM.get(9));
		System.out.println(HM.get(23));
		System.out.println(HM.get(0));
		HM.remove(9);
		System.out.println(HM.get(9));
		

	}

}
