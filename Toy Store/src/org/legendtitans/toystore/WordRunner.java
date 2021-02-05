package org.legendtitans.toystore;

public class WordRunner {

	public static void main(String[] args) {
		Word one = new Word("chicken");
		
		System.out.println(one);
		System.out.println(one.getVowelCount());
		System.out.println(one.getLength());
		
		one.setWord("alligator");
		System.out.println(one.getVowelCount());
	}

}
