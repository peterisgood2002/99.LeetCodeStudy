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
public class EASY_0257_BINARY_TREE_PATHS_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0257_BINARY_TREE_PATHS_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0257_BINARY_TREE_PATHS_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	TreeNode root = new TreeNode(1);
    	List<String> result = EASY_0257_BINARY_TREE_PATHS.binaryTreePaths(root);
    	Assert.assertEquals("1", result.get(0));
    	
    	root = new TreeNode(1);
    	root.left = new TreeNode(2);
    	root.right = new TreeNode(3);
    	root.left.right = new TreeNode(5);
    	result = EASY_0257_BINARY_TREE_PATHS.binaryTreePaths(root);
    	
    	Assert.assertEquals("1->2->5", result.get(0) );
    	Assert.assertEquals("1->3", result.get(1));
    	
    	
    	
     	
    }
    
   
   
}
