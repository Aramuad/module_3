package lab_4;

import java.util.Scanner;

public class gradeReport {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter the grade you got on the test: ");
		int grade = sc.nextInt();
		
		switch (grade) {
		
			case 100:
				System.out.println();
				System.out.println("You entered " + grade);
				System.out.println("That grade is a perfect score. Well done.");
				System.out.println();
				break;
			
			case 99:
			case 98:
			case 97:
			case 96:
			case 95:
			case 94:
			case 93:
			case 92:
			case 91:
			case 90:
				System.out.println();
				System.out.println("You entered " + grade);
				System.out.println("That grade is well above average. Excellent work.");
				System.out.println();
				break;
			
			case 89:
			case 88:
			case 87:
			case 86:
			case 85:
			case 84:
			case 83:
			case 82:
			case 81:
			case 80:
				System.out.println();
				System.out.println("You entered " + grade);
				System.out.println("That grade is above average. Nice job.");
				System.out.println();
				break;
				
			case 79:
			case 78:
			case 77:
			case 76:
			case 75:
			case 74:
			case 73:
			case 72:
			case 71:
			case 70:
				System.out.println();
				System.out.println("You entered " + grade);
				System.out.println("That grade is average work.");
				System.out.println();
				break;
			
			case 69:
			case 68:
			case 67:
			case 66:
			case 65:
			case 64:
			case 63:
			case 62:
			case 61:
			case 60:
				System.out.println();
				System.out.println("You entered " + grade);
				System.out.println("That grade is not good, you should seek help!");
				System.out.println();
				break;
				
			default:
				System.out.println();
				System.out.println("You entered " + grade);
				System.out.println("That grade is not passing.");
				System.out.println();
				
		}
		
	}

}
