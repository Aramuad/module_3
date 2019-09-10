package assignment_3;

import java.util.Scanner;
import java.lang.Math;

public class grease {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double height, sVolume, cVolume;
		double radius;
		
		System.out.println();
		System.out.print("Enter the radius: ");
		radius = sc.nextDouble();
		height = 15;
		
		cVolume = Math.PI * Math.pow(radius, 2) * height;
		sVolume = 4/3 * Math.PI * Math.pow(radius, 3);
		
		System.out.println("Cylinder volume: " + cVolume);
		System.out.printf("Sphere volume: " + sVolume);
		System.out.println();
		
			if (cVolume > sVolume) {
				
				System.out.println("You can put more grease in the cylinder!");
				System.out.println();
				
			} else {
				
				System.out.println("You can fit more grease in the sphere!");
				System.out.println();
				
			}
		
	}

}
