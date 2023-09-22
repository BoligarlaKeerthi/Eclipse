package exceptionPractices;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =9;
		int j =0;
		try {
			System.out.println("result" + i/j);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("please donot give 0 as value of j");
			
		}
		System.out.println("result for addition " + i+j);
		System.out.println("result for multiplication " + i*j);
		System.out.println("result for  substraction " + (i-j));
		

	}

}
