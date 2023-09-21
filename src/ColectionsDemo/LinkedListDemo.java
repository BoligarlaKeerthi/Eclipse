package ColectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cities=new LinkedList<>();
		
		cities.add("paris");
		cities.add("london");
		cities.add(2,"new delhi");
		cities.add("mumbai");
		
		//size of linkedList
		
		System.out.println(cities.size());
		
		//print the values
		
		Iterator itr=cities. iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		//get values
		
		System.out.println(cities.get(1));
		
		//does list contain a value
		
		System.out.println(cities.contains("hyderabad"));
		
		
		
		

	}

}
