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
public class EASY_0226_INVERT_BINARY_TREE_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0226_INVERT_BINARY_TREE_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0226_INVERT_BINARY_TREE_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] data = new int[] {4, 2, 7, 1, 3, 6, 9 };
    	int[] ans = new int[] {4, 7, 2, 9 ,6 ,3, 1};
    	
    	TreeNode td = TreeNode.createTreeNode(data);
    	
    	TreeNode result = EASY_0226_INVERT_BINARY_TREE.invertTree(td);
    	
    	Assert.assertNotNull(result);
    	
    }
    
   
   
}
