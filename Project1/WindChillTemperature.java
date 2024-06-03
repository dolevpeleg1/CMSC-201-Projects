/* Class: CMSC 201 33913
 * Instructor: Professor Tanveer
 * Platform: Windows 11, Eclipse
 * Description: Calculate the wind chill index.
 * Due: 01/30/2022
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Dolev Peleg*/

// Import the Scanner class
import java.util.Scanner;

// Create class named WindChillTemperature
public class WindChillTemperature
{
	
// Create a main function
	public static void main(String[] args)
	{
		// Create constants
		final double WIND_Chill_CONSTANT = 35.74;
		final double TEMPERATURE_COEFFICIENT = 0.6215;
		final double WIND_SPEED_COEFFICIENT = 35.75;
		final double SPEED_POWER = 0.16;
		final double TEMPERATURE_WIND_SPEED_COEFFICIENT = 0.4275;
		
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter temperature
		System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		
		// Get the input for temperature
		double temperature = input.nextDouble();
		
		// Prompt the user to enter the wind speed
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		
		// Get the input for temperature wind speed
		double windSpeed = input.nextDouble();
		
		// Calculations
		double windChillIndex = WIND_Chill_CONSTANT + TEMPERATURE_COEFFICIENT * temperature - WIND_SPEED_COEFFICIENT * Math.pow(windSpeed, SPEED_POWER) +
				TEMPERATURE_WIND_SPEED_COEFFICIENT * temperature * Math.pow(windSpeed, SPEED_POWER);
		
		// Display the wind chill index
		System.out.print("The wind chill index is " + windChillIndex);
	}
}
