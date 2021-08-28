package com.peter12.solution.easy;

public class EASY_0605_CAN_PLACE_FLOWERS {
	public boolean canPlaceFlowers(int[] flowerbed, int n) {

		if( n == 0 ) {
			return true;
		}

		for( int i = 0; i < flowerbed.length; i++ ) {
			if( flowerbed[i] == 0 ) {
				boolean canPlant = true;

				if( 0 < i && flowerbed[i - 1 ] == 1 ) {
					canPlant = false;
				}

				if( i < flowerbed.length - 1 && flowerbed[i+1] == 1 ) {
					canPlant = false;
				}

				if(canPlant ) {
					flowerbed[i] = 1;
					n--;

					if( n == 0 ) {
						return true;
					}
				}
			}

		}

		return false;
	}
}
