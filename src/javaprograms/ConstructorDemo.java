package javaprograms;

public class ConstructorDemo {
	public ConstructorDemo()
	{
		System.out.println("this is default constructor");
	}
		
	public ConstructorDemo(int a)
	{
		System.out.println("this is parametetrized constructor");
		System.out.println("the value of variable a is :" +a);
		
	}
     public ConstructorDemo(int a, int b)
     {
    	 System.out.println("this is parametetrized constructor");
 		System.out.println("the value of variable a is :" +a); 
 		System.out.println("the value of variable a is :" +b); 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo obj=new ConstructorDemo ();
		ConstructorDemo obj1=new ConstructorDemo (3);
		ConstructorDemo obj2=new ConstructorDemo (1,2);
	}

}
