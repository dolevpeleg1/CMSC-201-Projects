/*
 * Class: CMSC201 
 * Instructor: Professor Ashique Tanveer
 * Description: Design a class named Person and its two subclasses, Student and Employee. Make Faculty and Staff subclasses of Employe
 * Due: 04/10/22
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Dolev Peleg
*/

// Importing the Scanner class
import java.util.Scanner;

// Creating a Driver class
public class Driver
{
	public static void main(String[] args)
	{
		// Creating a scanner
		Scanner input = new Scanner(System.in);
		
		// Prompting the user to enter an input for creating a student or an employee
		System.out.println("1) to create a Student");
		System.out.println("2) to create an Employee");
		System.out.print("Choice: ");
		
		// Getting the user's input
		int choice = input.nextInt();
		input.nextLine();
		
		// Input validation
		while (choice != 1 && choice != 2)
		{
			System.out.println("Error! Please chooce 1 or 2");
			choice = input.nextInt();
			input.nextLine();
		}
		
		
		// Prompting and getting input for name
		System.out.print("Enter a name: ");
		String name = input.nextLine();
			
		// Prompting and getting input for address
		System.out.print("Enter " + name + "'s address: ");
		String address = input.nextLine();
			
		// Prompting and getting input for phone number
		System.out.print("Enter " + name + "'s phone number: ");
		String phoneNumber = input.nextLine();
			
		// Prompting and getting input for email address
		System.out.print("Enter " + name + "'s email: ");
		String email = input.nextLine();
			
		// If the user chooses to create a student
		if (choice == 1)
		{
			// Prompting and getting input for class status
			System.out.print("Enter " + name + "'s class Status: ");
			String classStatus = input.nextLine();
				
			// Creating a Student object based on the user's input
			Student newStudent = new Student(name, address, phoneNumber, email, classStatus);
			
			// Calling the toString method of Student
			System.out.println(newStudent.toString());
		}
		
		// If the user chooses to create an Employee
		else if (choice == 2)
		{
			// Prompting the user to enter an input for creating a faculty member or a staff member
			System.out.println("1) to create a faculty member");
			System.out.println("2) to create an staff member");
			System.out.print("Choice: ");
				
			// Getting the user's input
			int choice2 = input.nextInt();
			input.nextLine();
			
			// Input validation
			while (choice2 != 1 && choice2 != 2)
			{
				System.out.println("Error! Please chooce 1 or 2");
				choice2 = input.nextInt();
				input.nextLine();
			}
			
			
			// Prompting and getting input for office number
			System.out.print("Enter an office number: ");
			int officeNumber = input.nextInt();
			input.nextLine();
			
			// Prompting and getting input for salary
			System.out.print("Enter a salary: $");
			int salary = input.nextInt();
			input.nextLine();
					
			// Prompting and getting input for hire date
			System.out.print("Enter a hire date (mm/dd/yyyy): ");
			String hireDate = input.nextLine();
			
			// Creating a MyDate object based on the user's input
			MyDate myDate = new MyDate(hireDate);
			
			// If the user's chooses to create a Faculty
			if (choice2 == 1)
			{
				// Prompting and getting input for office hours
				System.out.print("Enter office hours: ");
				String officeHours = input.nextLine();
				
				// Prompting and getting input for rank
				System.out.print("Enter a rank: ");
				String rank = input.nextLine();
				
				// Creating a faculty object based on the user's input
				Faculty newFaculty = new Faculty(name, address, phoneNumber, email, officeNumber, salary, myDate, officeHours, rank);
				
				
				// Calling the toString method of Faculty
				System.out.println(newFaculty.toString());
			}
			
			// If the user chooses to create a Staff 
			else if (choice2 == 2)
			{
				// Prompting and getting input for title
				System.out.print("Enter a title: ");
				String title = input.nextLine();
				
				// Creating a staff member object based on the user's input
				Staff newStaff = new Staff(name, address, phoneNumber, email, officeNumber, salary, myDate, title);
				
				// Calling the toString method of Staff
				System.out.println(newStaff.toString());
			}
		}
		
	}
}
