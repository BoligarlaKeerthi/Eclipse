package javaprograms;

//class created

public class ClassObjConstructor {

	public ClassObjConstructor()
	{
		System.out.println("This is default Constructor");
	}
	
	public ClassObjConstructor(int a)
	{
		System.out.println("This is parametrized constructor ");
		System.out.println(" The value of variable a is :" + a);
	}
	
	public ClassObjConstructor(int a, int b)
	{
		System.out.println("This is parametrized constructor ");
		System.out.println(" The value of variable a is :" + a);
		System.out.println(" The value of variable a is :" + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//object created
		
		ClassObjConstructor obj = new ClassObjConstructor();
		ClassObjConstructor obj2 = new ClassObjConstructor(10); // prameterized constructor with 1 value
		ClassObjConstructor obj3 = new ClassObjConstructor(10,20); 
	}

}

	


