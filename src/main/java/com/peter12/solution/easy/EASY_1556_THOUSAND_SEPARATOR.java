package com.peter12.solution.easy;

public class EASY_1556_THOUSAND_SEPARATOR {
	public String thousandSeparator(int n) {

		String str = String.valueOf(n);

		String result = "";
		for( int i = str.length() - 1; i >= 0; i -= 3 ) {

			String s = "";
			if( i - 2 > 0 ) {
				s = str.substring( i - 2, i + 1);
				result = "." + s + result;
			} else {
				s = str.substring( 0, i + 1);
				result = s + result;
			}

			System.out.println(result); 


		}

		return result;

	}
}
