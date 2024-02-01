// Spencer Ordonez January 25th, 2024 Assignment 1

import java.util.Scanner;

public class Eggs {

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// I know the second scanner input does seem redundant, but it is the only way I can get Scanner to Work
		int dozen;
		int eggs;
		double costOfDozens;
		double costOfRemainders;
		double totalCost;
		System.out.println("How many eggs?");
		eggs = input.nextInt();
		int remainder;
		dozen = eggs/12;
		remainder = eggs%12;
		costOfDozens = dozen * 3.25;
		costOfRemainders = remainder * 0.45;
		totalCost = costOfDozens + costOfRemainders;
		System.out.println(eggs + " eggs equals " + dozen + " dozen and " + remainder + " eggs ");
		System.out.println("Total cost for the dozen is " +costOfDozens);
		System.out.println("Total cost for the individual eggs is " +costOfRemainders);
		System.out.println("Total cost is " +totalCost);
	}

}
