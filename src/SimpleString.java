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

	public boolean contains(char character) {
		
		boolean doesContain = false;
		
		for(int i = 0; i < charString.length; i++) {
			if(this.charAt(i) == character) {
				doesContain = true;
			}
		}
		
		return doesContain;
	}

	public int indexOf(char character) {
		
		int index = -1;
		
		for(int i = 0; i < charString.length; i++) {
			if(this.charAt(i) == character) {
				index = i;
				break;
			}
		}
		
		return index;
	}

	public boolean isEmpty() {
		
		if(charString.length > 0) {
			return false;
		} else {
			return true;
		}
	}

	public int length() {
		
		return charString.length;
	}
}
