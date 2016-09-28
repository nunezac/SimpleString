# SimpleString
###A project built for CSCI 373 on Test Driven Development

##Guidelines:
Write a class called SimpleString that implements a subset of the Java String class methods. You are to pretend that the Java String class does not exist and that you cannot use Java String literals. SimpleStrings are to be immutable. Here are the details:

1. Define a character array instance variable to hold the contents of your SimpleString.
2. Write a constructor that takes an array of characters as its parameter. Copy the actual argument into the above instance variable.
3. Methods:
  1. charAt(int index): returns the character at the given index.
  2. contains(char c): returns true if the string contains the character c, false otherwise.
  3. indexOf(char c): returns the index of the first occurrence of the character c in the string, -1 if the character does not appear in the string.
  4. isEmpty(): returns true if the string contains no characters, false otherwise.
  5. length(): returns the number of characters in the string.
  6. concat(SimpleString s): returns a new SimpleString that consists of a copy of this SimpleString with a copy of s concatenated to the end.
  7. substring(int startIndex, int endIndex): returns a new SimpleString that is a copy of the portion of this SimpleString that starts at index startIndex and ends at index endIndex - 1.
  8. equals(Object o): returns true if this SimpleString is equal to o.
  9. hashCode(): returns a hash code for this SimpleString.
  
You are to use test-driven development to develop this class. You must use JUnit for this. You will submit your SimpleString source file and your JUnit source file or files. Zip all source files in a folder and submit in the usual way by 11:55pm on September 27, 2016.