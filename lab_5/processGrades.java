/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Lab #:			5	←		*/

package lab_5;

import java.util.Scanner;
import java.util.Arrays;

public class processGrades {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		float[] scores = new float [4]; //array to handle sort
		float average; //float for average
		
		System.out.println();
		System.out.print("Enter the first integer: ");
		scores[0] = sc.nextFloat(); //take user input
		
		System.out.print("Enter the second integer: ");
		scores[1] = sc.nextFloat();
		
		System.out.print("Enter the third integer: ");
		scores[2] = sc.nextFloat();
		
		System.out.print("Enter the fourth integer: ");
		scores[3] = sc.nextFloat();
		System.out.println();
		
		average = (scores[0]+scores[1]+scores[2]+scores[3])/4; //average grades
		
		System.out.println("You entered: "+(int)scores [0]+", "+(int)scores[1]+", "+(int)scores[2]+", "+(int)scores[3]); //print in format required
		Arrays.sort(scores); //sort grades for highest to lowest
		System.out.println("Highest grade: " + (int)scores[3]); //.sort() orders lowest to highest so highest is last element
		System.out.println("Lowest grade: " + (int)scores[0]); //lowest is first element
		System.out.printf("Average grade: %1.2f", average); //print formatted average
		System.out.println();
		System.out.println();
		
	}

}
