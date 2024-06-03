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

// Creating a Faculty subclass of Employee
public class Faculty extends Employee
{
	private String officeHours;
	private String rank;
	
	// Creating a constructor for a Faculty object
	public Faculty(String name, String address, String phoneNumber, String emailAddress,
			int officeNumber, int salary, MyDate dateHired, String officeHours, String rank)
	{
		super(name, address, phoneNumber, emailAddress, officeNumber, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	// creating getters and setters for each data field
	public String getOfficeHours() 
	{
		return officeHours;
	}

	public void setOfficeHours(String officeHours) 
	{
		this.officeHours = officeHours;
	}

	public String getRank() 
	{
		return rank;
	}

	public void setRank(String rank) 
	{
		this.rank = rank;
	}
	
	// Creating an override of toString
		@Override
		public String toString()
		{
			return "Faculty: " + getName() + "\nRank: " + getRank() + "\nSalary: $" + getSalary() +
					"\nDate Hired: " + getDateHired() + "\n\nOffice Hours: " + getOfficeHours() + "\nOffice: " + 
					getOfficeNumber() + "\nAddress: " + getAddress() + "\nPhone Number: " + getPhoneNumber() + 
					"\nEmail Address: " + getEmailAddress();
		}
}
