package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
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
public class EASY_0118_PASCALS_TRIANGLE_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0118_PASCALS_TRIANGLE_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0118_PASCALS_TRIANGLE_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	List<List<Integer>> ans = createAnswer();
    	Assert.assertTrue(Util.equalsForList(ans, EASY_0118_PASCALS_TRIANGLE.generate(1)));
    	
    	
    	
    }
    
    public static List<List<Integer>> createAnswer() {
    	List<List<Integer>> result = new Vector<List<Integer>>();
    	
    	List<Integer> r1 = new Vector<Integer>();
    	r1.add(1);
    	
    	result.add(r1);
    	
    	r1 = new Vector<Integer>();
    	r1.add(1);
    	r1.add(1);
    	result.add(r1);
    	
    	r1 = new Vector<Integer>();
    	r1.add(1);
    	r1.add(2);
    	r1.add(1);
    	result.add(r1);
    	
    	r1 = new Vector<Integer>();
    	r1.add(1);
    	r1.add(3);
    	r1.add(3);
    	r1.add(1);
    	result.add(r1);
    	
    	r1 = new Vector<Integer>();
    	r1.add(1);
    	r1.add(4);
    	r1.add(6);
    	r1.add(4);
    	r1.add(1);
    	result.add(r1);
    	
    	return result;
    }
  
   
    
   
}
