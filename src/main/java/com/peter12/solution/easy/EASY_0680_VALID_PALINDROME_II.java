package com.peter12.solution.easy;

public class EASY_0680_VALID_PALINDROME_II {
	public static boolean validPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;

		int needDelete = 0;
		while( i <= j ) {
			if( s.charAt(i) != s.charAt(j) ) {

				boolean isLeft = isValid( s.substring( i + 1, j + 1) );
				boolean isRight = isValid( s.substring( i , j ) );

				if( !isLeft && !isRight ) {
					return false;
				} else {
                    return true;
                }

				

			}

			i++;
			j--;
		}

		//System.out.println("s = " + s + " i = " + i + " j = " + j );
		return true;
	}

	public static boolean isValid( String s ) {
		int i = 0;
		int j = s.length() - 1;

		while( i <= j ) {
			if( s.charAt(i) != s.charAt(j) ) {
				return false;
			}
			i++;
			j--;
		}

		return true;
	}
}
