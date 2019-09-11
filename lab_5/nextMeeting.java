package lab_5;

import java.util.Scanner;

public class nextMeeting {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int today, meeting;
		
		System.out.println();
		System.out.println("0) Monday");
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
	
		final int days[] =  {0, 1, 2, 3, 4, 5, 6};
		
			if (today == 0) {
				
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

		int i, x, n;
		n = days.length;
		
			for (i = 0; i < meeting; i++) {
				
				x = days[i % n];
				
			}
			
		x = days[i % n];
		
			if (x == 0) {
					
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