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
public class EASY_0401_BINARY_WATCH_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0401_BINARY_WATCH_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0401_BINARY_WATCH_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	List<String> ans = new Vector<String>();
    	ans.add("1:00");
    	ans.add("2:00");
    	ans.add("4:00");
    	ans.add("8:00");
    	ans.add("0:01");
    	ans.add("0:02");
    	ans.add("0:04");
    	ans.add("0:08");
    	ans.add("0:16");
    	ans.add("0:32");
    	
    	List<String> result = EASY_0401_BINARY_WATCH.readBinaryWatch(2);
    	
     
    	Assert.assertEquals(ans.size(), result.size());
    	
    	List<String> p = EASY_0401_BINARY_WATCH.getPossbibleResult(8 , 3);
    	Assert.assertEquals(56, p.size());
    	
    	p = EASY_0401_BINARY_WATCH.getPossbibleResult(4, 2);
    	Assert.assertEquals(6, p.size());
    	
    	
    	Assert.assertEquals("02", EASY_0401_BINARY_WATCH.bitToInteger(true, new int[] {0, 0, 1, 0}));
    	Assert.assertEquals("2", EASY_0401_BINARY_WATCH.bitToInteger(false, new int[] {0, 0, 1, 0}));
    	
    	Assert.assertEquals("10", EASY_0401_BINARY_WATCH.bitToInteger(true, new int[] {1, 0, 1, 0}));
    	

    	
    	
    }
    
   
   
}
