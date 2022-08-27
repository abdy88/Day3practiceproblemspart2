package day3practiceproblemsPart2;

import java.util.Scanner; 

public class LineComparisonComputation {

	static double linelength1;
	static double linelength2;

	
	public static void main(String[] args) {
	
	System.out.println("Welcome to Line Comparison Computation Program");
	linelength1=calcLinelength();
	System.out.println("Enter coordinates of second line");
	linelength2=calcLinelength();
	checkEqualityOfTwoLines();
	compareLines();

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

	
	 static void checkEqualityOfTwoLines()
   	{
     	

		 	if (linelength1==linelength2)
		 		{
		 			System.out.println("Two lines are equal");
 		  
		 		}
		  
		 	else
		 	{
		 			System.out.println("Two lines are not equal");
 		  
 		  
		 	}
			
 	 			
   	}
   
	 static void compareLines()
		{
			 if (linelength1==linelength2)
     	  {
     		  System.out.println("Two lines are equal");
			
     	  }
			
			 else if (linelength1 > linelength2)
			 {
				 
				System.out.println("Linelength1 is greater than Linelength2");
				 
			 }
			
			 else
			
			 {
				 System.out.println("Linelength2 is greater than Linelength1");
				 
			 }
		}
	
	
	
	
	}
