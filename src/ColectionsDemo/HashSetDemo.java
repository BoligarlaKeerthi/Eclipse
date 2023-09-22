package ColectionsDemo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> cities= new HashSet<>();
		cities.add("london");
		cities.add("newyork");
		cities.add("paris");
		cities.add("hyderabad");
		cities.add("delhi");
		//printing hash set
		for(String t: cities)
		{
			System.out.println(t);
		}
		System.out.println(cities.size());
		System.out.println(cities.contains("chennai")); //false
				
	}

}
