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
public class EASY_0501_FIND_MODE_IN_BINARY_SEARCH_TREE_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0501_FIND_MODE_IN_BINARY_SEARCH_TREE_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0501_FIND_MODE_IN_BINARY_SEARCH_TREE_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	TreeNode root = new TreeNode(6);
    	root.left = new TreeNode(2);
    	root.left.left = new TreeNode(0);
    	root.left.right = new TreeNode(4);
    	root.left.right.left = new TreeNode(2);
    	root.left.right.right = new TreeNode(6);
    	root.right = new TreeNode(8);
    	root.right.left = new TreeNode(7);
    	root.right.right = new TreeNode(9);
    	EASY_0501_FIND_MODE_IN_BINARY_SEARCH_TREE algo = new EASY_0501_FIND_MODE_IN_BINARY_SEARCH_TREE();
    	int[] result = algo.findMode(root);
    	Assert.assertEquals(2, result[0]);
    	Assert.assertEquals(6, result[1]);
    	
    	root = new TreeNode(-2);
    	root.left = new TreeNode(-2);
    	root.right = new TreeNode(-2);
    	algo = new EASY_0501_FIND_MODE_IN_BINARY_SEARCH_TREE();
    	result = algo.findMode(root);
    	Assert.assertEquals(-2, result[0]);
    	
    	
    	root = new TreeNode(1);
    	root.right = new TreeNode(2);
    	root.right.left = new TreeNode(2);
    	root.right.right = new TreeNode(3);
    	root.right.right.left = new TreeNode(3);
//    	root.right.right.left.left = new TreeNode(3);
    	algo = new EASY_0501_FIND_MODE_IN_BINARY_SEARCH_TREE();
    	result = algo.findMode(root);
    	
    	Assert.assertEquals(2, result[0]);
    	Assert.assertEquals(3, result[1]);

    	
    }
    
   
   
}
