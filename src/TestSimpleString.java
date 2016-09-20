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
	
	private char[] charString = {'A','l', 'e', 'c'};
	private SimpleString exampleString;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		exampleString = new SimpleString(charString);
	}
	
	@Test
	public void testCharAt() {
		
		int index = 0;
		
		assertEquals(charString[index], exampleString.charAt(index));
	}
	
	@Test
	public void testContains() {
		
		assertTrue(exampleString.contains('A'));
		assertFalse(exampleString.contains('x'));
	}

}
