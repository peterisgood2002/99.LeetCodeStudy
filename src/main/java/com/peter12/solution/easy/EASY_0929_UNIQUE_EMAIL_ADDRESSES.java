package com.peter12.solution.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class EASY_0929_UNIQUE_EMAIL_ADDRESSES {
	public int numUniqueEmails(String[] emails) {
		/*
           Local name@Domain name
           Local name: 
              ".": forward to the same address w/o "."
              "+": ignore the rest of the string
		 */

		HashMap<String, Set<String> > domains = new HashMap<String, Set<String> >();
		for( String e : emails ) {
			String[] split = e.split("@");
			Set<String> l = domains.get(split[1]);

			if( l == null ) {
				l = new HashSet<String>();
				domains.put(split[1], l);
			}

			//Deal with local name based on the rules
			// 1. remove all "."
			String local = split[0].replace("." , "");

			// 2. "+"
			int index = local.indexOf("+");

			if( index > 0 ) {
				local = local.substring(0, index);
			}

			l.add( local);
		}

		int result = 0;
		for( HashMap.Entry<String, Set<String> > e: domains.entrySet() ) {
			result += e.getValue().size();
		}

		return result;

	}
}
