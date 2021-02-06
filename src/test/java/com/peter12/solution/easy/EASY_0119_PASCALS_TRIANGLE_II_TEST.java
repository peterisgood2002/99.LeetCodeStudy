package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.data.TreeNode;
import com.peter12.solution.data.TreeNodeData;
import com.peter12.solution.easy.EASY_0020_VALID_PARENTHESES;
import com.peter12.solution.util.ResultCheck;
import com.peter12.solution.util.Util;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EASY_0119_PASCALS_TRIANGLE_II_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0119_PASCALS_TRIANGLE_II_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0119_PASCALS_TRIANGLE_II_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	
    	List<Integer> r1 = new Vector<Integer>();
    	r1.add(1);
    	Assert.assertTrue(ResultCheck.equalForList(r1, EASY_0119_PASCALS_TRIANGLE_II.getRow(0)));
    	
    	r1 = new Vector<Integer>();
    	r1.add(1);
    	r1.add(1);
    	Assert.assertTrue(ResultCheck.equalForList(r1, EASY_0119_PASCALS_TRIANGLE_II.getRow(01)));
    	
    	r1 = new Vector<Integer>();
    	r1.add(1);
    	r1.add(2);
    	r1.add(1);
    	Assert.assertTrue(ResultCheck.equalForList(r1, EASY_0119_PASCALS_TRIANGLE_II.getRow(2)));
    	
    	r1 = new Vector<Integer>();
    	r1.add(1);
    	r1.add(3);
    	r1.add(3);
    	r1.add(1);
    	Assert.assertTrue(ResultCheck.equalForList(r1, EASY_0119_PASCALS_TRIANGLE_II.getRow(3)));
    	
    	r1 = new Vector<Integer>();
    	r1.add(1);
    	r1.add(4);
    	r1.add(6);
    	r1.add(4);
    	r1.add(1);
    	Assert.assertTrue(ResultCheck.equalForList(r1, EASY_0119_PASCALS_TRIANGLE_II.getRow(4)));
    	
    	
    	
    }
    
   
}
