package com.peter12.solution.easy;

public class EASY_1694_REFORMAT_PHONE_NUMBER {
	public String reformatNumber(String number) {
        String remove = number.replace( " ", "");
        remove = remove.replace( "-", "" );
        
        String result = "";
        while( remove.length() > 0 ) {
            
            int groupl = 3;
            if( remove.length() <= 4 ) {
                if( remove.length() % 2  == 0 ) {
                    groupl = 2;
                }
            }  
        
            System.out.println( "remove = " + remove + " groupl = " + groupl);
            
            String sub = remove.substring( 0, groupl);
            result += sub;
            
            if( remove.length() > groupl ) {
                result += "-";
            }
            
            remove = remove.substring( groupl);
            
        }
        
        return result;
        
    }
}
