package day3practiceproblemsPart2;

import java.util.Scanner; 

public class LineComparisonComputation {

	static double linelength1;
	
	public static void main(String[] args) {
	
	System.out.println("Welcome to Line Comparison Computation Program");
	
	linelength1=calcLinelength();
	
	}
	
	
	 static double calcLinelength() {
		 
		 	Scanner myObj = new Scanner(System.in);
			

		 	System.out.println("Enter x1 coordinate ");
			float x1 = myObj.nextFloat();
			System.out.println("Enter y1 coordinate ");
			float y1 = myObj.nextFloat();
			System.out.println("Enter x2 coordinate ");
			float x2 = myObj.nextFloat();
			System.out.println("Enter y2 coordinate ");
			float y2 = myObj.nextFloat();
			
			
			System.out.println(" x1= " + x1 );
			System.out.println(" y1= " + y1 );
			System.out.println(" x2= " + x2 );
			System.out.println(" y2= " + y2 );
		 
			double linelength = (Math.sqrt(( ((x2 - x1) *(x2 - x1)) + ((y2- y1) * (y2 - y1)))));
			System.out.println("line length is = " + linelength  );
			
			return linelength;
			
			
		  }

	
	
	
	
	
	
	
	
	
	
}
