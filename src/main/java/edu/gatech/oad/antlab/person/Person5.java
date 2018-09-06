package edu.gatech.oad.antlab.person;

/**
 *  A simple class for person 5
 *  returns their name and a
 *  modified string 
 *  
 *  @author Peter Lee plee99
 *  @version 1.1
 */
public class Person5 {

  /** Holds the persons real name */
  private String name;
  	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
  public Person5(String pname) {
    name = pname;
  }
  	/**
	 * This method should take the string
	 * input and return its characters rotated
	 * 2 positions.
	 * given "gtg123b" it should return
	 * "g123bgt".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 5 put your implementation here
	  char[] inputchars = input.toCharArray();
	  int length = input.length();
	  int[] order = new int[length];
	  for (int i = 0; i < length ; i++) {
	  	order[i] = i + 2;
	  }
	  order[length - 2] = 0;
	  order[length - 1] = 1;
	  StringBuilder result = new StringBuilder();
	  for (int i = 0; i < length; i++) {
	  	result.append(inputchars[order[i]]);
	  }
	  return result.toString();
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
