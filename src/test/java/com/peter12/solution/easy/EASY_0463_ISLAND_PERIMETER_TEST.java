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
public class EASY_0463_ISLAND_PERIMETER_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0463_ISLAND_PERIMETER_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0463_ISLAND_PERIMETER_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[][] data = new int[4][];
    	data[0] = new int[] { 0, 1, 0, 0 };
    	data[1] = new int[] { 1, 1, 1, 0 };
    	data[2] = new int[] { 0, 1, 0 ,0 };
    	data[3] = new int[] { 1, 1, 0 ,0 };
    	
    	Assert.assertEquals(16, EASY_0463_ISLAND_PERIMETER.islandPerimeter(data)  );
    	
    }
    
   
   
}
