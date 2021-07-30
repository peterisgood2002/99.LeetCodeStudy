package com.peter12.solution.easy;

import java.util.ArrayList;
import java.util.List;

public class EASY_1598_CRAWLER_LOG_FOLDER {
	public int minOperations(String[] logs) {

		List<String>  folder = new ArrayList<String>(); //Empty means in root
		for( String l : logs ) {
			if( "../".equals( l ) ) {
				if( folder.size() > 0 ) {
					folder.remove( folder.size() - 1);
				} 
			} else if ( "./".equals(l) ) {
				continue;
			} else {
				folder.add(l);
			}
		}

		return folder.size();
	}
}
