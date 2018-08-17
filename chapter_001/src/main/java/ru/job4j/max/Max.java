package ru.job4j.max;

/**
 *@author Aleksey Siminko (mailto:alekseysimink@gmail.com)
 * @version $Id$
 * @version 0.1
 */

public class Max {
	/**
	 * method for Max number find
	 * @param first, second
	 *
	 */
	public int max(int first, int second) {
		return first > second ? first : second;
	}
	public int max(int first, int second, int third) {
		return max(max(first, second), max(second, third));
	}
}