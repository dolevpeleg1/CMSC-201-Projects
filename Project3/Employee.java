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

// Creating an Employee subclass of Person
public class Employee extends Person
{
	// Creating data fields for Employee
	private int officeNumber;
	private int salary;
	private MyDate dateHired;
	
	// Creating a constructor for an Employee object
	public Employee(String name, String address, String phoneNumber, String emailAddress,
			int officeNumber, int salary, MyDate dateHired)
	{
		super(name, address, phoneNumber, emailAddress);
		this.officeNumber = officeNumber;
		this.salary = salary;
		this.dateHired = dateHired;
	}

	// creating getters and setters for each data field
	public int getOfficeNumber() 
	{
		return officeNumber;
	}

	public void setOfficeNumber(int officeNumber) 
	{
		this.officeNumber = officeNumber;
	}

	public int getSalary() 
	{
		return salary;
	}

	public void setSalary(int salary) 
	{
		this.salary = salary;
	}

	public String getDateHired() 
	{
		return dateHired.getDate();
	}

	public void setDateHired(MyDate dateHired) 
	{
		this.dateHired = dateHired;
	}
	
	
}
