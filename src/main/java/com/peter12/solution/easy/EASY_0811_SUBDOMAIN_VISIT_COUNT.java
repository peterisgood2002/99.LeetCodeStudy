package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EASY_0811_SUBDOMAIN_VISIT_COUNT {
	public List<String> subdomainVisits(String[] cpdomains) {
HashMap<String, Integer> count = new  HashMap<String, Integer>();
        
        for( String str : cpdomains ) {
            //"9001 discuss.leetcode.com"
            String[] split = str.split(" ");
            int c = Integer.valueOf( split[0] );
            
            String domain = split[1];
            while( domain != "" ) {
                Integer d = count.get(domain);
                if( d == null ) {
                    d = 0;
                }
                
                //System.out.println( "domain = " + domain + " d = " + d);
                d += c;
                
                count.put(domain, d);
                
                //Find parent domain
                int index = domain.indexOf(".");
                if( index != -1 ) {
                    domain = domain.substring( index + 1);
                } else {
                    domain = "";
                }
                
                
                
            }
                        
        }
        
        List<String> result = new ArrayList<String>();
        for( HashMap.Entry<String, Integer> e : count.entrySet() ) {
            String r = e.getValue() + " " + e.getKey();
            
            result.add(r);
        }
        
        return result;

	}
}
