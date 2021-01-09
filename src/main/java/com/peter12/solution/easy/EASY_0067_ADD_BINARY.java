package com.peter12.solution.easy;

public class EASY_0067_ADD_BINARY {
	public static String addBinary(String a, String b) {

		//Alignment
		String addend = a;
		String summand = b;
		int missingDigit = a.length() - b.length();
		if( missingDigit > 0 ) {
			summand = addLeading0Digit(summand, missingDigit);
		} 
		if(missingDigit < 0){
			addend = addLeading0Digit(addend, -missingDigit);
		}


		String result = "";

		int[] caddend = changeToIntArray(addend);
		int[] csummand = changeToIntArray(summand);

		for(int i = caddend.length - 1; i >= 0; i--) {
			int val = caddend[i] + csummand[i];
			result = convertToBinary(val) + result;
			if( val >= 2 )  {

				//Carry
				if( i - 1 < 0 ) {
					result = "1" + result;
				} else {
					caddend[i-1]++;
				}


			}
		}

		return result;
	}

	public static String convertToBinary(int val ) {
		int v = val % 2 ;
		return String.valueOf(v);

	}

	public static int[] changeToIntArray(String a ) {
		int[] result = new int[a.length()];

		char[] data = a.toCharArray();
		for( int i = 0; i < data.length; i++ ) {
			if( data[i] == '0' ) {
				result[i] = 0;
			} 

			if( data[i] == '1' ) {
				result[i] = 1;
			}
		}

		return result;
	}

	public static String addLeading0Digit(String data, int leadingSize) {
		StringBuilder result = new StringBuilder();
		for( int i = 0; i < leadingSize; i++ ) {
			result.append("0");
		}

		result.append(data);

		return result.toString();


	}
}
