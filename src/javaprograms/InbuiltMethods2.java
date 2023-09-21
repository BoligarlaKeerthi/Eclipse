package javaprograms;

public class InbuiltMethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String title="simplilearn online courses";
		//method 1: contains()
		
		if(title.contains("simplilearn"))
		{
			System.out.println("title is valid and test cases passed");
		}
		else
		{
			System.out.println("title is not valid and test cases failed");
		
			}
		//method 2:equals()
		
		if(title.equals("simplilearn online courses"))
		{
			System.out.println("title is valid and test cases passed");	
		}
		else
		{
			System.out.println("title is not valid and test cases failed");
		
			}
		//method 3:substring
		
		String title2="practice lab Java";
		String result=title2.substring(13);
		if(result.equals("Java"))
		{
			System.out.println(" valid and test cases passed");
		}
		else
		{
			System.out.println(" not valid and test cases failed");
		
			}
		}
	}


