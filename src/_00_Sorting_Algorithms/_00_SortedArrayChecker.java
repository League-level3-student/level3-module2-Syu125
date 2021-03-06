package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	static String s = "";

	// 1. Write a static method called intArraySorted.
	static boolean intArraySorted(int[] integers) {
		if (integers[0] < integers[integers.length - 1]) {
			return true;
		}
		return false;

	}
	// This method takes in an array of integers
	// and it returns a boolean.
	// The method returns true if the integer
	// array is in ascending order and false otherwise

	// 2. Write a static method called doubleArraySorted.
	static boolean doubleArraySorted(double[] doubles) {
		if (doubles[0] < doubles[doubles.length - 1]) {
			return true;
		}
		return false;
	}
	// This method takes in an array of doubles
	// and it returns a boolean.
	// The method returns true if the double
	// array is in ascending order and false otherwise

	// 3. Write a static method called charArraySorted.
	static boolean charArraySorted(char[] characters) {
		if (characters[0] < characters[characters.length - 1]) {
			return true;
		}
		return false;
	}
	// This method takes in an array of characters
	// and it returns a boolean.
	// The method returns true if the character
	// array is in alphabetical order and false otherwise
	// (You can compare characters just like integers)

	// 4. Write a static method called stringArraySorted.

	static boolean stringArraySorted(String[] strings) {
		// s.compare
		for (int i = 0; i < strings.length; i++) {
			if (i < strings.length - 1) {
				if (strings[i].compareToIgnoreCase(strings[i + 1]) > 0) {
					return false;
				}
			}
		}

		return true;
	}
	// This method takes in an array of Strings
	// and it returns a boolean.
	// The method returns true if the String
	// array is in alphabetical order and false otherwise
	// (Use the compareTo(String) method)

}
