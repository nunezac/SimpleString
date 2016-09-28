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
	
	@Test
	public void testConcat() {
		
		assertEquals(exampleString.length(), exampleString.concat(emptyString).length());
		assertEquals(emptyString.length(), emptyString.concat(emptyString).length());
		assertEquals(2 * exampleString.length(), exampleString.concat(exampleString).length());
	}
	
	@Test
	public void testSubstring() {
		
		assertEquals(1, exampleString.substring(0, 1).length());
		assertEquals(4, exampleString.substring(0, 4).length());
		assertEquals(0, emptyString.substring(0, 0).length());
	}
	
	@Test
	public void testEquals() {
		
		assertTrue(exampleString.equals(exampleString));
		assertTrue(emptyString.equals(emptyString));
		assertFalse(exampleString.equals(emptyString));
		
		assertTrue(exampleString.equals(exampleString.concat(emptyString)));
		assertTrue(emptyString.equals(emptyString.concat(emptyString)));
	}
	
	@Test
	public void testHashCode() {
		
		assertNotEquals(emptyString.hashCode(), exampleString.hashCode());
		assertEquals(emptyString.hashCode(), emptyString.hashCode());
		assertEquals(exampleString.hashCode(), exampleString.hashCode());
		
		assertEquals(18, emptyString.hashCode());
		assertEquals(-177367174, exampleString.hashCode());
	}

}
