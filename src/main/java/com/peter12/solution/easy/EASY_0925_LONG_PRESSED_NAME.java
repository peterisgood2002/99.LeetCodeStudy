package com.peter12.solution.easy;

public class EASY_0925_LONG_PRESSED_NAME {
	public boolean isLongPressedName(String name, String typed) {

		/*
            https://www.programmersought.com/article/8990205545/
            maintain two index one for name; the other for typed 
            and judge every characters

		 */

		int i = 0, j = 0;
		while( i < name.length() ) {
			char ch = name.charAt(i);
			int countn = 0;

			while( i < name.length() && name.charAt(i) == ch ) {
				countn++;
				i++;
			}

			int countt = 0;
			while( j < typed.length() && typed.charAt(j) == ch ) {
				countt++;
				j++;
			}

			if( countn > countt ) {
				return false;// we may not type the name
			}

		}

		if( j < typed.length() ) {
			return false; // the typed has not been finished and he may not type his name
		} else {
			return true;
		}


	}
}
