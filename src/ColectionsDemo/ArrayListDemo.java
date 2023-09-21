package ColectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cities=new ArrayList<>();
		cities.add("paris");
		cities.add("london");
		cities.add(2,"new delhi");
		cities.add("mumbai");
		//size of arrayList
		
		System.out.println(cities.size());
		
		//print the items in the list
		
		for(String t : cities)
		{
			System.out.println(t);
		}
	}

}
