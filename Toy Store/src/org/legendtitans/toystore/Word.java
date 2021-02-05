package org.legendtitans.toystore;

public class Word {
	private String w;
	private String Svowels= "aeiouAEIOU";
	
	public Word(String w) {
		this.w = w;
	}
	
	public void setWord(String wordIn) {
		w = wordIn;
	}
	
	public int getVowelCount() {
		int count = 0;
		
		for (int i=0; i<w.length();i++) {
			String s = String.valueOf(w.charAt(i));
			if (s.chars().anyMatch(ch -> Svowels.contains(String.valueOf((char) ch)))) {
				count++;
			}
			
		}
		return count;
	}
	
	public int getLength() {
		return w.length();
	}
	
	public String toString() {
		return w;
	}

}

/*if (Arrays.stream(vowels).anyMatch(w.charAt(i)::equals)) {
				count++;
			for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < vowels.length(); j++) {
				char c = word.charAt(i);
				if (c == vowels.charAt(j)) {
					vowelCount = vowelCount + 1;
				}
			}
		}
		return vowelCount;
	}
			}
			
			*
			*
			Stream<Character> cStream = Arrays.stream(vowels);
		
		for (int i=0; i<w.length();i++) {
			if (cStream.anyMatch((Character)w.charAt(i))) {
				count++;
			}*/
