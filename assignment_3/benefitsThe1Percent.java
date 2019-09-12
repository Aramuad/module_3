package assignment_3;

import java.util.Scanner;
import java.lang.Math;

public class benefitsThe1Percent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int salary;
		Double taxes = 9525 * .10;
		Double taxes1 = 29175 * .12;
		Double taxes2 = 43800 * .22;
		Double taxes3 = 74700 * .24;
		Double taxes4 = 42800 * .32;
		Double taxes5 = 300000 * .35;
		Double taxes6;
		Double total = 0.0;
		
		System.out.println();
		System.out.print("Enter your salary: $");
		salary = sc.nextInt();
		
		if (salary <= 9525) {
		
			total = taxes;
			System.out.println("Total taxes owed is $" + (int)Math.floor(total));
			System.out.println();
			
		} else if (salary > 9525 && salary <= 38700) {

			taxes1 = (salary - 9525) * .12;
			total = taxes + taxes1;
			System.out.println("Total taxes owed is $" + (int)Math.floor(total));
			System.out.println();
			
		} else if (salary > 38700 && salary <= 82500) {
			
			taxes2 = (salary - 38700) * .22;
			total = taxes + taxes1 + taxes2;
			System.out.println("Total taxes owed is $" + (int)Math.floor(total));
			System.out.println();
			
		} else if (salary > 82500 && salary <= 157500) {
			
			taxes3 = (salary - 82500) * .24;
			total = taxes + taxes1 + taxes2 + taxes3;
			System.out.println("Total taxes owed is $" + (int)Math.floor(total));
			System.out.println();
			
		} else if (salary > 157500 && salary <= 200000) {
			
			taxes4 = (salary - 157200) * .32;
			total = taxes + taxes1 + taxes2 + taxes3 + taxes4;
			System.out.println("Total taxes owed is $" + (int)Math.floor(total));
			System.out.println();
			
		} else if (salary > 200000 && salary <= 500000) {
			
			taxes5 = (salary - 200000) * .35;
			total = taxes + taxes1 + taxes2 + taxes3 + taxes4 + taxes5;
			System.out.println("Total taxes owed is $" + (int)Math.floor(total));
			System.out.println();
			
		} else if (salary > 500000) {
			
			taxes6 = (salary - 500000) * .37;
			total = taxes + taxes1 + taxes2 + taxes3 + taxes4 + taxes5 + taxes6;
			System.out.println("Total taxes owed is $" + (int)Math.floor(total));
			System.out.println();
			
		}
		
	}

}
