package com.peter12.solution.easy;

public class EASY_1678_GOAL_PARSER_INTERPRETATION {
	public String interpret(String command) {
        String result = command.replace( "()", "o" );
        
        System.out.println( result);
        result = result.replace( "(al)", "al");
        
        return result;
    }
}
