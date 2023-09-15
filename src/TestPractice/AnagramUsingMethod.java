package TestPractice;

import java.util.Arrays;

public class AnagramUsingMethod {
	public static void main(String[] args) {
		String g = "tamil";
		String g1 = "milta";
		if (checkAnagram(g, g1)) {
			System.out.println("It is anagram.");
		} else {
			System.out.println("No,It is not anagram");
		}
		// System.out.println(checkAnagram(g, g1));
	}

	private static boolean checkAnagram(String g, String g1) {
		// TODO Auto-generated method stub
		if(g.length()!=g1.length()) {
			return false;
		}
		char [] c = g.toCharArray();
		char [] c1 = g1.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		for(int i=0;i<c.length;i++) {
			if(c[i]!=c1[i]) {
				return false;
			}
		}
		return true;
	}
}
