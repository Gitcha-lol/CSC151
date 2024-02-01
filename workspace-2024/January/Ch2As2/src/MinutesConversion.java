// Spencer Ordonez January 25th, 2024 Assignment 2

import java.util.Scanner;

public class MinutesConversion {

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int hours;
		int days;
		double numberOfHours;
		double numberOfMinutes;
		double numberOfDays;
		System.out.print("Enter Minutes: ");
		int minutes;
		minutes = input.nextInt();
		hours = minutes/60;
		days = hours/24;
		// I do not know how to get it to accurately display how many hours and days in decimal.
		numberOfHours = hours;
		numberOfDays = days;
		System.out.println("Total number of Hours is: " +numberOfHours);
		System.out.println("Total number of Days is: " +numberOfDays);

	}

}
