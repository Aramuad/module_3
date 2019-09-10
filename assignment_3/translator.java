package assignment_3;

import java.util.Scanner;

public class translator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String word;
		
		System.out.println();
		System.out.print("Enter a word to be translated: ");
		word = sc.nextLine().toLowerCase();
		
		switch (word) {
		
			case "hello":
				System.out.println("Salveo");
				break;
			
			case "goodbye":
				System.out.println("valeo");
				break;
			
			case "food":
				System.out.println("tener");
				break;
			
			case "water":
				System.out.println("pinna");
				break;
			
			case "where is":
				System.out.println("ubi est");
				break;
			
			case "i want":
				System.out.println("ego fames");
				break;
				
			default:
				System.out.println("Please enter a valid word");
				break;
		
		}
		
		translator.main(args);
		
	}

}
