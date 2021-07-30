package com.peter12.solution.easy;

public class EASY_1507_REFORMAT_DATE {
	public String reformatDate(String date) {
		String[] month = new String[] {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

		String[] split = date.split(" ");

		String result = split[2] + "-";

		for( int i = 0; i < month.length; i++ ) {
			if( month[i].equals( split[1] ) ){

				String m = String.valueOf( i + 1);
				if( m.length() == 1 ) {
					m = "0" + m;
				}
				result += m + "-";
			}
		}

		String day = split[0].substring(0, split[0].length() - 2 );
		if( day.length() == 1) {
			day = "0" + day;
		}
		result += day;

		return result;


	}
}
