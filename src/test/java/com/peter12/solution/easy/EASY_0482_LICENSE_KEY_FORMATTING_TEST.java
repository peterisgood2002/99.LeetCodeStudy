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
public class EASY_0482_LICENSE_KEY_FORMATTING_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0482_LICENSE_KEY_FORMATTING_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0482_LICENSE_KEY_FORMATTING_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	Assert.assertEquals("", EASY_0482_LICENSE_KEY_FORMATTING.licenseKeyFormatting("---", 3));
    	Assert.assertEquals("24A0-R74K", EASY_0482_LICENSE_KEY_FORMATTING.licenseKeyFormatting("2-4A0r7-4k", 4));
    	Assert.assertEquals("5F3Z-2E9W", EASY_0482_LICENSE_KEY_FORMATTING.licenseKeyFormatting("5F3Z-2e-9-w", 4));
    	
    	Assert.assertEquals("2-5G-3J", EASY_0482_LICENSE_KEY_FORMATTING.licenseKeyFormatting("2-5g-3-J", 2));
    	
    }
    
   
   
}
