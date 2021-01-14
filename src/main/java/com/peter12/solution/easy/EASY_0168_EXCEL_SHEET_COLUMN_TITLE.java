package com.peter12.solution.easy;

public class EASY_0168_EXCEL_SHEET_COLUMN_TITLE {
	public static String convertToTitle(int n) {
	
		String result = "";
		
		do{
			int remainder = n % 26;
			if( remainder != 0 ) {
				result = convertIntToChar(remainder) + result;
			}  else {
				result = "Z" + result;
				n--;//52 = AZ however 52 / 26 = 2 we will obtain BZ
			}
			
			
			n /= 26;
		} while( n >= 1 ) ;
		
		return result;
		
		
		
	}
	
	public static char convertIntToChar(int n ) {
		return (char)(n + 64);
	}
	
}
