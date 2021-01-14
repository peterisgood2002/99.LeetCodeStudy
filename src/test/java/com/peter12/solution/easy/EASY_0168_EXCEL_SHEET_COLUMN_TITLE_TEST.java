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
public class EASY_0168_EXCEL_SHEET_COLUMN_TITLE_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0168_EXCEL_SHEET_COLUMN_TITLE_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0168_EXCEL_SHEET_COLUMN_TITLE_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	char test = EASY_0168_EXCEL_SHEET_COLUMN_TITLE.convertIntToChar(26);
    	Assert.assertEquals("AAA", EASY_0168_EXCEL_SHEET_COLUMN_TITLE.convertToTitle(703));
    	Assert.assertEquals("AZ", EASY_0168_EXCEL_SHEET_COLUMN_TITLE.convertToTitle(52));
    	Assert.assertEquals("AAA", EASY_0168_EXCEL_SHEET_COLUMN_TITLE.convertToTitle(703));
    	Assert.assertEquals("ZZ", EASY_0168_EXCEL_SHEET_COLUMN_TITLE.convertToTitle(702));
    	Assert.assertEquals("ZY", EASY_0168_EXCEL_SHEET_COLUMN_TITLE.convertToTitle(701));
    	Assert.assertEquals("Z", EASY_0168_EXCEL_SHEET_COLUMN_TITLE.convertToTitle(26));
    	
    	Assert.assertEquals("A", EASY_0168_EXCEL_SHEET_COLUMN_TITLE.convertToTitle(1));
    	Assert.assertEquals("AB", EASY_0168_EXCEL_SHEET_COLUMN_TITLE.convertToTitle(28));
    	
    }
    
   
   
}
