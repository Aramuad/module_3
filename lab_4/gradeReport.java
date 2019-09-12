package lab_4;

import java.util.Scanner;

public class gradeReport {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println();
		System.out.print("Enter the grade you got on the test: ");
		int grade = sc.nextInt();
		int holder = grade/10;
		
		switch (holder) {
		
			case 10:
				System.out.println();
				System.out.println("You entered " + grade);
				System.out.println("That grade is a perfect score. Well done.");
				System.out.println();
				break;
				
			case 9:
				System.out.println();
				System.out.println("You entered " + grade);
				System.out.println("That grade is well above average. Excellent work.");
				System.out.println();
				break;
				
			case 8:
				System.out.println();
				System.out.println("You entered " + grade);
				System.out.println("That grade is above average. Nice job.");
				System.out.println();
				break;
				
			case 7:
				System.out.println();
				System.out.println("You entered " + grade);
				System.out.println("That grade is average work.");
				System.out.println();
				break;
				
			case 6:
				System.out.println();
				System.out.println("You entered " + grade);
				System.out.println("That grade is not good, you should seek help!");
				System.out.println();
				break;
				
			case 5:
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
