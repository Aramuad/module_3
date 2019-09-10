package assignment_3;

import java.util.Scanner;

public class adventure {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String entry;
	
		System.out.println();
		System.out.println("You're sitting on the couch at home when suddenly a wild saiyan appears!");
		System.out.print("Do you punch him or ask his name? (punch/ask): ");
		entry = sc.nextLine().toLowerCase();
		
		String punch = "punch";
		String ask = "ask";
		
			if (entry.contentEquals(punch)) {
				
				System.out.println();
				System.out.println("You attempt to punch the saiyan, he catches your fist with his teeth...");
				System.out.print("Do you scream and try to break free or go for the glock 40 on your hip? (break/glock): ");
				entry = sc.nextLine().toLowerCase();				
				
				String breakfree = "break";
				String glock = "glock";
				
					if (entry.contentEquals(breakfree)) {
						
						System.out.println();
						System.out.println("You try to pull your hand away but he just starts eating it. You die a miserable death.");
						System.out.println();
						
					} else if (entry.contentEquals(glock)) {
						
						System.out.println();
						System.out.println("You pull your glock and shoot him in the face.");
						System.out.print("The bullet bounces off and he flings you through the wall. Your body is unrecognizeable. \n");
						System.out.println();
						
					}
					
			} else if (entry.contentEquals(ask)) {
				
				System.out.println();
				System.out.println("You ask him his name. He doesn't acknowlege your existence.");
				System.out.print("Do you try to be assertive and press the issue,\n");
				System.out.print("or just continue sitting on the couch in awe? (press/sit): ");
				entry = sc.nextLine().toLowerCase();
				
				String press = "press";
				String sit = "sit";
				
					if (entry.contentEquals(press)) {
						
						System.out.println();
						System.out.println("You scream at him to identify himself,");
						System.out.print("he casually sends a needle thin beam of energy through your chest.\n");
						System.out.println();
						
					} else if (entry.contentEquals(sit)) {
						
						System.out.println();
						System.out.println("Finally he looks at you, and demands to know where your food is kept.");
						System.out.print("Eyes wide, you point in the direction of the kitchen.\n");
						System.out.print("He proceeds to empty it of the entirety of its contents, then jumps through the ceiling and disappears.\n");
						System.out.println();
						
					}
				
			}
		
	}

}
