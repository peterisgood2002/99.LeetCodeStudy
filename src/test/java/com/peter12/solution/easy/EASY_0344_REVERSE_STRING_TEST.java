package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.data.ListNodeData;
import com.peter12.solution.data.TreeNode;
import com.peter12.solution.data.TreeNodeData;
import com.peter12.solution.easy.EASY_0020_VALID_PARENTHESES;
import com.peter12.solution.util.Util;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EASY_0344_REVERSE_STRING_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0344_REVERSE_STRING_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0344_REVERSE_STRING_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	char[] data = new char[] {'h', 'e', 'l', 'l', 'o' };
    	char[] ans = new char[] {'o', 'l', 'l', 'e', 'h'};
    	
    	EASY_0344_REVERSE_STRING.reverseString(data);
    	
    	for( int i = 0; i < data.length; i++ ) {
    		Assert.assertEquals(ans[i],  data[i]);
    	}
    	
    	data = new char[] {'H','a','n','n','a','h' };
    	ans = new char[] {'h','a','n','n','a','H'};
    	
    	EASY_0344_REVERSE_STRING.reverseString(data);
    	
    	for( int i = 0; i < data.length; i++ ) {
    		Assert.assertEquals(ans[i],  data[i]);
    	}
    	
    	
    	
     	
    }
    
   
   
}
