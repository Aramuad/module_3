/*	Class:			CSE 1321L
	Section: 		28          
	Term:			FALL  
	Instructor:		AFRIN
	Name:			SAM BALLARD  
	Lab #:			5	←		*/

package lab_5;

import java.util.Scanner;

public class nextMeeting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int today, meeting;	//int vars
		
		System.out.println();
		System.out.println("0) Monday");	//menu list of choices
		System.out.println("1) Tuesday");
		System.out.println("2) Wednesday");
		System.out.println("3) Thursday");
		System.out.println("4) Friday");
		System.out.println("5) Saturday");
		System.out.println("6) Sunday");
		System.out.println();
		System.out.print("Enter what day today is: ");
		today = sc.nextInt();
		
		System.out.print("Enter how many days until your meeting: ");
		meeting = sc.nextInt();
	
		final int days[] =  {0, 1, 2, 3, 4, 5, 6};	//array to handle days of week
		
			if (today == 0) { 	//if else if to assign int value to day of week
				
				System.out.println();
				System.out.println("Today is Monday");
			
			} else if (today == 1) {
			
				System.out.println();
				System.out.println("Today is Tuesday");
			
			} else if (today == 2) {
			
				System.out.println();
				System.out.println("Today is Wednesday");
			
			} else if (today == 3) {

				System.out.println();
				System.out.println("Today is Thursday");
			
			} else if (today == 4) {
			
				System.out.println();
				System.out.println("Today is Friday");
			
			} else if (today == 5) {
			
				System.out.println();
				System.out.println("Today is Saturday");
			
			} else if (today == 6) {
			
				System.out.println();
				System.out.println("Today is Sunday");
			
			}

		System.out.println("Days to the meeting is " + meeting + " days");

		int i, x, n;	//three int vars
		n = days.length; //length of array
		
			for (i = 0; i < meeting; i++) {	//for loop, i = 0, while i is less than meeting day
											// iterate to the next day
				x = days[i % n];	//mod array days by its length to start at beginning of array
				
			}
			
		x = days[i % n]; //for some reason x wasnt passed on so had to assign twice, scope is wierd.
		
			if (x == 0) { //if else if to assign x var int to its corresponding day of the week
					
			System.out.println("Meeting day is Monday");
				System.out.println();
					
			} else if (x == 1) {
					
				System.out.println("Meeting day is Tuesday");
				System.out.println();
					
			} else if (x == 2) {
					
				System.out.println("Meeting day is Wednesday");
				System.out.println();
					
			} else if (x == 3) {
				
				System.out.println("Meeting day is Thursday");
				System.out.println();
					
			} else if (x == 4) {
					
				System.out.println("Meeting day is Friday");
				System.out.println();
					
			} else if (x == 5) {
					
				System.out.println("Meeting day is Saturday");
				System.out.println();
					
			} else if (x == 6) {
					
				System.out.println("Meeting day is Sunday");
				System.out.println();
					
			}
		
		}
		
	}