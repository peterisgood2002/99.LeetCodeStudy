package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.List;

public class EASY_1496_PATH_CROSSING {
	public boolean isPathCrossing(String path) {
		List< int[] > points = new ArrayList< int[] >();
		int[] point = new int[] {0 ,0};
		points.add(point);

		int x = 0 , y = 0;
		for( char p : path.toCharArray() ) {
			switch( p ) {
			case 'N':
				y++;
				break;
			case 'S':
				y--;
				break;
			case 'E':
				x++;
				break;
			case 'W':
				x--;
				break;
			}

			boolean visited = hasPoints( x, y, points );
			System.out.println( " x = " + x + " y = " + y + " visited = " + visited);
			if( visited ) {
				return true;// Circle
			}

			int[] newP = new int[] {x, y};
			points.add( newP );
		}

		return false;
	}

	public boolean hasPoints(int x, int y, List< int[] > points) {

		for( int[] p : points ) {
			if( x == p[0] && y == p[1] ) {
				return true;
			}
		}
		return false;
	}
}
