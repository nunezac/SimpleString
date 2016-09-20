/**
 * 
 */

/**
 * @author Alec Nunez<anunez@unca.edu>
 *
 */
public class SimpleString {
	
	char[] charString;
	
	public SimpleString(char[] charString) {
		this.charString = charString;
	}

	public char charAt(int index) {
		
		return charString[index];
	}
}
