package javaprograms;

public class AcessModifier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessModifier1 obj = new AccessModifier1 ();
		
		System.out.println(obj.hours); //default modifier
		System.out.println(	obj.mins);
		System.out.println(obj.name);//public modifier
		System.out.println(obj.tool);
		System.out.println(obj.x);   //protected modifier
		System.out.println(obj.z);
		
//private access modifier can not accessed outside the class
	}

}
