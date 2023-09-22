package exceptionPractices;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MulitipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a number");
		int num1=scan.nextInt();
		System.out.println("enter another number");
		int num2=scan.nextInt();
		int result=num1/num2;
		System.out.println("the division of 2 numbers is : " +result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("please do not enter 0 in denominator");
		}
		catch(InputMismatchException e)
		{
			System.out.println("please enter only integer values");
		}
		catch(Exception e)
		{
			System.out.println("please enter valid input");
		}
		
		
	}
	

}
