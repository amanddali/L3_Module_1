package SearchingAndSortingAlgorithms;

import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		return eggs.indexOf("cracked");
	}

	public static int countPearls(List<Boolean> oysters) {
		return oysters.indexOf(true);
	}

	public static Double findTallest(List<Double> peeps) {
		double tallest = Double.MIN_VALUE;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> words) {
		int longest = 0;
		String s = "";
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > longest) {
				longest = words.get(i).length();
				s = words.get(i);
			}
		}
		return s;
	}

	public static boolean containsSOS(List<String> message2) {
		boolean b = false;
		String SOS = "... --- ...";
		for (int i = 0; i < message2.size(); i++) {
			if (message2.get(i).contains(SOS)) {
				b = true;
			}
		}
		return b;
	}

	public static List<Double> sortScores(List<Double> results) {
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 0; i < results.size() - 1; i++) {
				if (results.get(i) > results.get(i + 1)) {
					double d = results.get(i);
					results.set(i, results.get(i + 1));
					results.set(i + 1, d);
					swap = true;
				}
			}
		}
//		Collections.sort(results);
		return results;
	}

	public static List<String> sortDNA(List<String> unsortedSequences) {
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 0; i < unsortedSequences.size() - 1; i++) {
				if (unsortedSequences.get(i).length() > unsortedSequences.get(i + 1).length()) {
					String s = unsortedSequences.get(i);
					unsortedSequences.set(i, unsortedSequences.get(i + 1));
					unsortedSequences.set(i + 1, s);
					swap = true;
				}
			}
		}
		return unsortedSequences;
	}

	public static List<String> sortWords(List<String> words) {
		boolean swap = true;
		while (swap) {
			swap = false;
			for (int i = 0; i < words.size() - 1; i++) {
				if (words.get(i).compareTo(words.get(i + 1)) == 1) {
					String s = words.get(i);
					words.set(i, words.get(i + 1));
					words.set(i + 1, s);
					swap = true;
				}
			}
		}
		return words;
	}

}