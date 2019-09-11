package lab_4;

import java.util.Scanner;

public class gradeReport {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println();
		System.out.print("Enter the grade you got on the test: ");
		int grade = sc.nextInt();
		
		int holder;
		
			if (grade == 100) {
				
				holder = 1;
				
			} else if (grade < 100 && grade >= 90) {
				
				holder = 2;
				
			} else if (grade < 90 && grade >= 80) {
				
				holder = 3;
				
			} else if (grade < 80 && grade >= 70) {
				
				holder = 4;
				
			} else if (grade < 70 && grade >= 60) {
				
				holder = 5;
				
			} else if (grade < 60 && grade >= 0) {
				
				holder = 6;
				
			} else {
				
				holder = 7;
				
			}
		
		switch (holder) {
		
			case 1:
				System.out.println();
				System.out.println("You entered " + grade);
				System.out.println("That grade is a perfect score. Well done.");
				System.out.println();
				break;
				
			case 2:
				System.out.println();
				System.out.println("You entered " + grade);
				System.out.println("That grade is well above average. Excellent work.");
				System.out.println();
				break;
				
			case 3:
				System.out.println();
				System.out.println("You entered " + grade);
				System.out.println("That grade is above average. Nice job.");
				System.out.println();
				break;
				
			case 4:
				System.out.println();
				System.out.println("You entered " + grade);
				System.out.println("That grade is average work.");
				System.out.println();
				break;
				
			case 5:
				System.out.println();
				System.out.println("You entered " + grade);
				System.out.println("That grade is not good, you should seek help!");
				System.out.println();
				break;
				
			case 6:
				System.out.println();
				System.out.println("You entered " + grade);
				System.out.println("That grade is not passing.");
				System.out.println();
				break;
				
				default:
					System.out.println();
					System.out.println();
					System.out.print("Please enter a valid test score...");
					gradeReport.main(args);
				
		}
		
	}

}
