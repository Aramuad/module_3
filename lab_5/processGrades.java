package lab_5;

import java.util.Scanner;
import java.util.Arrays;

public class processGrades {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d;
		int [] scores;
		float average;
		
		System.out.println();
		System.out.print("Enter the first integer: ");
		a = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter the second integer: ");
		b = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter the third integer: ");
		c = sc.nextInt();
		System.out.println();
		
		System.out.print("Enter the fourth integer: ");
		d = sc.nextInt();
		System.out.println();
		
		average = (a+b+c+d)/4;
		scores = new int[]{a, b, c, d};
		Arrays.sort(scores);
		
		System.out.println("You entered: " + a + ", " + b + ", " + c + ", " + d);
		System.out.println("Highest grade: " + scores[3]);
		System.out.println("Lowest grade: " + scores[0]);
		System.out.printf("Average grade: %1.2f", average);
		System.out.println();
		System.out.println();
		
	}

}
