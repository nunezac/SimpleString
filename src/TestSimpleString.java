import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @date Sep 15, 2016
 * @project: SimpleString
 */

/**
 * @author Alec Nunez<anunez@unca.edu>
 *
 */
public class TestSimpleString {
	
	private char[] charArray = {'A','l', 'e', 'c', ' ', 'r', 'o', 'c', 'k', 's', '!'};
	private char[] emptyArray = {};
	private SimpleString exampleString;
	private SimpleString emptyString;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		exampleString = new SimpleString(charArray);
		emptyString = new SimpleString(emptyArray);
	}
	
	@Test
	public void testCharAt() {
		
		int index = 0;
		
		assertEquals(charArray[index], exampleString.charAt(index));
	}
	
	@Test
	public void testContains() {
		
		assertTrue(exampleString.contains('A'));
		assertFalse(exampleString.contains('x'));
	}
	
	@Test
	public void testIndexOf() {
		
		assertEquals(0, exampleString.indexOf('A'));
		assertEquals(3, exampleString.indexOf('c'));
		assertEquals(-1, exampleString.indexOf('x'));
	}
	
	@Test
	public void testIsEmpty() {
		
		assertTrue(emptyString.isEmpty());
		assertFalse(exampleString.isEmpty());
	}
	
	@Test
	public void testLength() {
		
		assertEquals(11, exampleString.length());
		assertEquals(0, emptyString.length());
	}

}
