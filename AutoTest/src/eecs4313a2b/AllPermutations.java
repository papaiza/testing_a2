package eecs4313a2b;

import java.util.ArrayList;

public class AllPermutations {

	static ArrayList<String> combinations = new ArrayList<String>();

	public static void printBin(String soFar, int iterations) {
		if (iterations == 0) {
			// System.out.println(soFar);
			combinations.add(soFar);
		} else {
			printBin(soFar + "0", iterations - 1);
			printBin(soFar + "1", iterations - 1);
		}
	}

	public static void main(String[] args) {
		// this prints out all the binary combinations of 7 digits

		printBin("", 7);

		// if the digit in locatin 1 is a 0, then 1 is not part of the string
		// for example 0001000 would translate to "4"

		for (int i = 0; i < combinations.size(); i++) {

			String current = combinations.get(i);

			for (int j = 0; j < current.length(); j++) {
				if (current.charAt(j) == '1') {
					System.out.print(j + 1);
				}

			}
			System.out.println();

			// System.out.println(combinations.get(i));
		}

	}

}

