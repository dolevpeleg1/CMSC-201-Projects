/* Class: CMSC 201 33913
 * Instructor: Professor Tanveer
 * Platform: Windows 11, Eclipse
 * Description: Calculate the cost of driving.
 * Due: 01/30/2022
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Dolev Peleg*/

// Import the Scanner class
import java.util.Scanner;

// Create class named CostOfDriving
public class CostOfDriving 
{

// Create a main function
	public static void main(String[] args)
	{
		// Create a scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt to enter the driving distance
		System.out.print("Enter the driving distance: ");
		
		// Get input for driving distance
		double drivingDistance = input.nextDouble();
		
		// Prompt to enter the miles per gallon
		System.out.print("Enter miles per gallon: ");
		
		// Get input for miles per gallon
		double milesPerGallon = input.nextDouble();
		
		// Prompt to enter the price per gallon
		System.out.print("Enter price per gallon: ");
		
		// Get input for price per gallon
		double pricePerGallon = input.nextDouble();
		
		// Calculate
		double costOfDriving = drivingDistance / milesPerGallon * pricePerGallon;
		
		// Display the cost of driving
		System.out.print("The cost of driving is " + costOfDriving);
		
	}
}