package com.peter12.solution.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class EASY_1436_DESTINATION_CITY {
	public String destCity(List<List<String>> paths) {

		HashMap<String, String> pmap = new HashMap<String, String>();
		HashSet<String> cities = new HashSet<String>();

		for( List<String> p : paths ) {
			pmap.put( p.get(0), p.get(1));

			cities.add( p.get(0) );
			cities.add( p.get(1) );
		}

		for( String c : cities ) {
			String d = pmap.get( c );
			System.out.println( c );
			if( d == null ) {
				return c;
			}

		}

		return "";
	}
}
