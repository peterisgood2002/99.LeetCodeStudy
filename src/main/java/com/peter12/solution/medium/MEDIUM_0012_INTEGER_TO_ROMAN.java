package com.peter12.solution.medium;

public class MEDIUM_0012_INTEGER_TO_ROMAN {
	public static String intToRoman(int num) {
		StringBuilder result = new StringBuilder();

		while ( num > 0 ) {
			if( num >= 1000 ) {
				num = getRomanString(num, 1000, result);
			}

			if( num >= 900 ) {
				result.append( "CM" );
				num -= 900;
			}
			if( num >= 500 ) {
				num = getRomanString(num, 500, result);
			}

			if( num >= 400 ) {
				result.append( "CD" );
				num -= 400;
			}

			if( num >= 100 ) {
				num = getRomanString(num, 100, result);
			}

			if( num >= 90 ) {
				result.append( "XC" );
				num -= 90;
			}

			if( num >= 50 ) {
				num = getRomanString(num, 50, result);
			}

			if( num >= 40 ) {
				result.append( "XL" );
				num -= 40;
			}

			if( num >= 10 ) {
				num = getRomanString(num, 10, result);
			}

			if( num >= 9 ) {
				result.append( "IX" );
				num -= 9;
			}

			if( num >= 5 ) {
				num = getRomanString(num, 5, result);
			}

			if( num >= 4 ) {
				result.append( "IV" );
				num -= 4;
			}

			if( num >= 1 ) {
				num = getRomanString(num, 1, result);
			}


		}

		return result.toString();
	}

	public static int getRomanString(int num, int symbolValue, StringBuilder result) {

		int count = num / symbolValue;
		for( int i = 0; i < count; i++ ) {
			result.append( getSymbol( symbolValue) );
		}
		
		return num % symbolValue;


	}

	public static String getSymbol(int value) {
		switch( value ) {
		case 1: 
			return "I";
		case 5:
			return "V";
		case 10:
			return "X";
		case 50:
			return "L";
		case 100:
			return "C";
		case 500:
			return "D";
		case 1000:
			return "M";
		default: 
			return "I";

		}
	}


}
