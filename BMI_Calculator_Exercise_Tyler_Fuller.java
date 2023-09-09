import java.util.*; // Import Scanner for user input

public class BMI_Calculator_Exercise_Tyler_Fuller {

	public static void main(String[] args) {
		
		// Define constants
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double METERS_PER_INCH = 0.0254;
		
		// Define variables
		double weightInPounds, heightInInches, weightInKilograms, heightInMeters, bmi;

		// Prompt user for weight (in lb) and height (in in)
		System.out.println("Enter weight: ");
		System.out.println("Enter height: ");
		Scanner input = new Scanner(System.in);
		weightInPounds = input.nextDouble();
		heightInInches = input.nextDouble();
		input.close();
		
		// Convert pounds to kilograms, and inches to meters
		weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
		heightInMeters = heightInInches * METERS_PER_INCH;
		
		// Calculate the BMI
		bmi = weightInKilograms / Math.pow(heightInMeters, 2);
		
		// Display the BMI
		System.out.println("BMI is " + bmi);
		
		// Interpret the BMI
		if (bmi < 18.5)
			System.out.print("Underweight");
		else if (bmi >= 18.5 && bmi < 25.0)
			System.out.print("Normal");
		else if (bmi >= 25.0 && bmi < 30.0)
			System.out.print("Overweight");
		else if (bmi >= 30)
			System.out.print("Obese");
		
	}
}