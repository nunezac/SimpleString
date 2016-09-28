import java.util.Arrays;

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

	public SimpleString concat(SimpleString string) {
		
		int totalLength = this.length() + string.length();
		char[] concatArray = new char[totalLength];
		
		int j = 0;
		for(int i = 0; i < totalLength; i++) {
			if(i < this.length()) {
				concatArray[i] = this.charAt(i);
			} else {
				concatArray[i] = string.charAt(j);
				j++;
			}
		}
		
		return new SimpleString(concatArray);
	}
	
	public SimpleString substring(int startIndex, int endIndex) {
		
		char[] substringArray = new char[endIndex - startIndex];
		
		int j = startIndex;
		for(int i = 0; i < endIndex; i++) {
			substringArray[i] = this.charAt(j);
		}
		
		return new SimpleString(substringArray);
	}

	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		SimpleString other = (SimpleString) obj;
		if(!Arrays.equals(charString, other.charString)) {
			return false;
		}
		return true;
	}
	
	public int hashCode() {
		
		final int prime = 17;
		int result = 1;
		result = prime * result + Arrays.hashCode(charString);
		return result;
	}
	
}
