package lab_4;

import java.util.Scanner;

public class youth {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		System.out.println();
		
		System.out.println("You entered: " + age);
		
			if (age <= 21) {
				
				System.out.println("Youth is such a wonderful thing. Enjoy.");
				
			}
		
		System.out.println("Age is a state of mind.");
		System.out.println();
	}

}