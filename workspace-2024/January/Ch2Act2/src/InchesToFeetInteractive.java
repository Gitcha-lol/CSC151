// Spencer Ordonez January 25th, 2024 Activity 2

import java.util.Scanner;

public class InchesToFeetInteractive {

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				final int divisor = 12;
				int inches, feet;
				System.out.print("Measurement in Inches: ");
				inches = input.nextInt();
				feet = inches/divisor;
				inches = inches%divisor;
				System.out.print(feet+"feet"+inches+"inches");

	}

}
