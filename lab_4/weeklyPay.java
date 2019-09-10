package lab_4;

import java.util.Scanner;

public class weeklyPay {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int wage;
		System.out.println();
		System.out.print("Enter your hourly wage: ");
		wage = sc.nextInt();
		
		int hours;
		System.out.println();
		System.out.print("Enter how many hours worked this week: ");
		hours = sc.nextInt();
		
		double earnings;
		int value;
		
			if (hours > 40) {
				
				
				earnings = (hours * 1.5) * wage;
				value = (int)Math.round(earnings);
				
			} else {
				
				earnings = hours * wage;
				value = (int)Math.round(earnings);
				
			}
			
		System.out.println();	
		System.out.printf("You entered " + hours + " hours.");
		System.out.println();
		System.out.printf("Gross earning is $" + value);
		System.out.println();
		System.out.println();
		
	}

}
