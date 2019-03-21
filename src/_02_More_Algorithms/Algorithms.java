package _02_More_Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int broken = 0;
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i).equals("cracked")) {
				broken += 1;
			}
		}
		return broken;
	}

	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for (int i = 0; i < oysters.size(); i++) {
			if (oysters.get(i).booleanValue() == true) {
				count += 1;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);

			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		int letters = 0;
		String word = "";
		for (int i = 0; i < words.size(); i++) {

			if (words.get(i).toCharArray().length > letters) {
				letters = words.get(i).toCharArray().length;
				word = words.get(i);
			}
		}
		return word;
	}

	public static boolean containsSOS(List<String> message) {
		String sos = " ... --- ... ";
		for (int i = 0; i < message.size(); i++) {

			if (message.get(i).equals(sos)) {
				return true;
			}
		}
		return false;

	}

	public static List<Double> sortScores(List<Double> results) {
		List<Double> score = Arrays.asList();
		double order = 0.0;
		int num = 0;
		for (int i = 0; i < results.size(); i++) {
			for (int j = results.size(); j > 0; j--) {

				if (order < results.get(j)) {
					order = results.get(j);
					num = j;
				}

			}
			results.remove(num);
			score.add(results.get(num));
		}
		return score;
	}

	public static ArrayList<String> sortDNA(List<String> sequence) {
		int length = 30;
		int index = 0;
		int size = sequence.size();

		ArrayList<String>ordered = new ArrayList<String>();
		//for (int j = size-1; j >=0; j--) {
			for (int i = size-1; i >= 0; i--) {
				if (length > sequence.get(i).length()) {
					length = sequence.get(i).length();
					index = i;
				}
			}
			ordered.add(sequence.get(index));
			System.out.println(size);
		sequence.remove(index);
			
	//	}
	//	List<String>result = Arrays
		
		return ordered;
	}
}
