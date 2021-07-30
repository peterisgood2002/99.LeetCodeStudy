package com.peter12.solution.easy;

public class EASY_0824_GOAT_LATIN {
public String toGoatLatin(String sentence) {
        
        String[] split = sentence.split(" ");
        
        StringBuilder result = new StringBuilder();
        for( int i = 0; i < split.length; i++ ) {
            result.append( applyRule( i, split[i])  );
            
            if( i != split.length - 1 ) {
                result.append(" " );
            }
        }
        
        
        return result.toString();
    }
    
    public String applyRule(int index, String word) {
        String result = "";
        
        char first = word.charAt(0);
        if(  first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u' ||
             first == 'A' || first == 'E' || first == 'I' || first == 'O' || first == 'U'
        ) {
            //Rule1 add ma
            result = word;
        } else {
            //Rule 2 : move first letter to the end and add ma
            result = word.substring(1) + first;
        }
        
        result += "ma";
        
        for( int i = 0; i <= index; i++ ) {
            result += "a";
        }
        
        //System.out.println( result );
        return result;
        
        
    }
}
