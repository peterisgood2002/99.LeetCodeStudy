package com.peter12.solution.easy;

public class EASY_0292_NIM_GAME {
	public static boolean canWinNim(int n) {
		
		/*
		 * n = 3, 2 ,1   ==> V
		 * n = 4         ==> X
		 * n = 5 = 1 + 4 ==> V
		 * n = 6 = 2 + 4 ==> V
		 * n = 7 = 3 + 4 ==> V
		 * n = 8         ==> X
		 * 
		 * if n = 4 * i    ==> X
		 * 
		 * */
	
		return n % 4 != 0;
	}
	
	
}
