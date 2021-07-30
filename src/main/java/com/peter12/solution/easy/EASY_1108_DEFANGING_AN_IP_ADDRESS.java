package com.peter12.solution.easy;

public class EASY_1108_DEFANGING_AN_IP_ADDRESS {
	public String defangIPaddr(String address) {
        String[] split = address.split("\\.");
        
        String result = "";
        for( int i = 0; i < split.length; i++ ) {
            System.out.print( split[i] + " " );
            result += split[i];
            
            if( i != split.length - 1 ) {
                result += "[.]";
            }
        }
        
        return result;
    }
}
