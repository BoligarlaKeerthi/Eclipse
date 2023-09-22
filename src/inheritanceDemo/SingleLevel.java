package inheritanceDemo;

public class SingleLevel
{
	public void method()
	{
		System.out.println("base class method");
		
	}
	static class child extends SingleLevel {
		public void method1()
		{
			System.out.println("child  class method");
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			child obj=new child();
			obj.method();
			obj.method1();
		}

}

}



