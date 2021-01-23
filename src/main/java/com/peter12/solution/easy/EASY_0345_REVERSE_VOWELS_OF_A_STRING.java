package com.peter12.solution.easy;

public class EASY_0345_REVERSE_VOWELS_OF_A_STRING {
	public static String reverseVowels(String s) {

		char[] ch = s.toCharArray();
		boolean[] change = new boolean[ch.length];

		int i = 0;
		int j = ch.length - 1;

		while( i < j ) {

			//Find Vowel
			while( i < ch.length && !isVowel(ch[i]) &&  change[i] == false ) {
				i++;
			}
			while( j >= 0        && !isVowel(ch[j]) &&  change[j] == false ) {
				j--;
			}

			if( i < j ) {
				//Swap
				char tmp = ch[i];
				ch[i] = ch[j];
				ch[j] = tmp;
			}
			

			//Note
			if( i < ch.length) {
				change[i] = true;
			}
			
			if( j >= 0 ) {
				change[j] = true;
			}
			

			//Next
			i++;
			j--;
		}


		return new String(ch);

	}

	public static boolean isVowel(char c) {
		return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
			|| c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
	}
}
