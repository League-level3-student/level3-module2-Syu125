package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int broken = 0;
		for(int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				broken+=1;
			}
		}
		return broken;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int count = 0;
		for(int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i).booleanValue()== true) {
				count+=1;
			}
		}
		return count;
	}
	
	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for(int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i)>tallest) {
				tallest = peeps.get(i);
				System.out.println(tallest);
			}
		}
		return tallest;
	}
}
