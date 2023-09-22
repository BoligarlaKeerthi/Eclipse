package exceptionPractices;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Trywithresources {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	try(PrintWriter writer = new  PrintWriter(new File("paste the path"))) {
		
		writer.println("hello All");
		
	}
	catch(ArithmeticException e){
	   System.out.println(e.getMessage());
	   System.out.println("No fiel found");
	}
		

	}

}


