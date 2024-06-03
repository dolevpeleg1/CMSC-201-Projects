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

import org.junit.*;
import org.junit.jupiter.api.Test;

public class StringTest {
	private String s = "Dolev Peleg";
	
	@Before
	public void setUp() throws Exception
	{
	}
		
	@Test
	public void testLength() 
	{
		assertTrue(s.length() == 11);
	}
	
	@Test
	public void testCharAt() 
	{
		assertTrue(s.charAt(0) == 'D');
	}
	
	@Test
	public void testSubstring() 
	{
		assertTrue(s.substring(0) == "Dolev Peleg");
	}
	
	@Test
	public void testIndexOf() 
	{
		assertTrue(s.indexOf('D') == 0);
	}

}
