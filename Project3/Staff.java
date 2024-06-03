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

// Creating a Staff subclass of Employee
public class Staff extends Employee 
{
	private String title;
	
	// Creating a constructor for a Staff object
	public Staff(String name, String address, String phoneNumber, String emailAddress,
			int officeNumber, int salary, MyDate dateHired, String title)
	{
		super(name, address, phoneNumber, emailAddress, officeNumber, salary, dateHired);
		this.title = title;
	}

	// creating getters and setters for title
	public String getTitle() 
	{
		return title;
	}



	public void setTitle(String title) 
	{
		this.title = title;
	}



		// Creating an override of toString
		@Override
		public String toString()
		{
			return "Staff: " + super.getName() + "\nTitle: " + getTitle() + "\nSalary: $" + super.getSalary() +
					"\nDate Hired: " + super.getDateHired() + "\n\nOffice: " + super.getOfficeNumber() +
					"\nAddress: " + super.getAddress() + "\nPhone Number: " + super.getPhoneNumber() + "\nEmail Address: " + super.getEmailAddress();
		}
}
