// Spencer Ordonez January 25th, 2024 Activity 2

public class InchesToFeet {

	public static void main(String[] args) {
		final int divisor = 12;
		int inches = 86 ,feet;
		feet = inches/divisor;
		inches = inches%divisor;
		System.out.print(feet+"feet"+inches+"inches");

	}

}
