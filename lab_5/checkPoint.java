/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Lab #:			5	←		*/

package lab_5;

import java.util.Scanner;

public class checkPoint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, y; //two ints vars
		
		System.out.println();
		System.out.print("Enter the X-coordinate: ");
		x = sc.nextInt(); //read user input and assign to vars
		
		System.out.print("Enter the Y-coordinate: ");
		y = sc.nextInt();
		
		String point = ""; //initialize empty string
		
			if (x == 0 && y == 0) { //compare user input to x and y values 
				
				point = "is the origin point."; //assign appropriate statement for where the point lies
												// depending on x and y values
			} else if (x == 0) {
				
				point = "is on the Y-axis.";
				
			} else if (y == 0) {
				
				point = "is on the X-axis.";
				
			} else if (x > 0 && y > 0) {
				
				point = "is in the first quadrant.";
				
			} else if (x < 0 && y > 0) {
				
				point = "is in the second quadrant.";
				
			} else if (x < 0 && y < 0) {
				
				point = "is in the third quadrant.";
				
			} else if (x > 0 && y < 0) {
				
				point = "is in the fourth quadrant.";
				
			}
		
		System.out.println(); //print in required format
		System.out.println("X-coordinate is " + x);
		System.out.println("Y-coordinate is " + y);
		System.out.println("(" + x + ", " + y + ") " + point);
		System.out.println();
			
	}

}