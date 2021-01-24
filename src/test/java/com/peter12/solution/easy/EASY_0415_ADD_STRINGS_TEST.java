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
public class EASY_0415_ADD_STRINGS_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0415_ADD_STRINGS_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0415_ADD_STRINGS_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    
    	Assert.assertEquals( "10", EASY_0415_ADD_STRINGS.addStrings("1", "9"));
    	Assert.assertEquals( "6984362587", EASY_0415_ADD_STRINGS.addStrings("6913259244", "71103343"));
    	
    	Assert.assertEquals( "5", EASY_0415_ADD_STRINGS.addStrings("2", "3"));
    	Assert.assertEquals( "196", EASY_0415_ADD_STRINGS.addStrings("98", "98"));
    	
    	Assert.assertEquals( "0", EASY_0415_ADD_STRINGS.addStrings("0", "0"));
    	
    	Assert.assertEquals( "296", EASY_0415_ADD_STRINGS.addStrings("198", "98"));
    	
    	
    }
    
   
   
}
