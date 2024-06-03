/*
 * Class: CMSC201 
 * Instructor: Professor Ashique Tanveer
 * Description: Working with JUnit and GitHub
 * Due: 05/15/22
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Dolev Peleg
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeNumberMethodTest 
{
	@Test
	void test() 
	{
		assertTrue(PrimeNumberMethod.isPrime(11) == true);
		assertTrue(PrimeNumberMethod.isPrime(50) == false);
	}

}
