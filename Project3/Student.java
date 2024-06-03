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

// Creating a Student subclass of Person
public class Student extends Person
{
	// Creating  data field for Student
	private final String STATUS;
	
	// Creating a constructor for a Student object
	public Student(String name, String address, String phoneNumber, String emailAddress, String status)
	{
		super(name, address, phoneNumber, emailAddress);
		STATUS = status;
	}
	
	
	// Creating a getter method for status
	public String getSTATUS() {
		return STATUS;
	}

	// Creating an override of toString
	@Override
	public String toString()
	{
		return "Student: " + super.getName() + "\nStatus: " + getSTATUS() + "\nAddress: " + super.getAddress() +
				"\nPhone Number: " + super.getPhoneNumber() + "\nEmail Address: " + super.getEmailAddress();
	}
}
