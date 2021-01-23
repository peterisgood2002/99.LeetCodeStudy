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
public class EASY_0235_LOWEST_COMMON_ANCESTOR_OF_A_BINARY_SEARCH_TREE_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0235_LOWEST_COMMON_ANCESTOR_OF_A_BINARY_SEARCH_TREE_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0235_LOWEST_COMMON_ANCESTOR_OF_A_BINARY_SEARCH_TREE_TEST.class );
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
    	TreeNode p = new TreeNode(2);
    	root.left = p;
    	root.left.left = new TreeNode(0);
    	TreeNode q1 = new TreeNode(4);
    	root.left.right = q1;
    	root.left.right.left = new TreeNode(3);
    	root.left.right.right = new TreeNode(5);
    	
    	TreeNode q = new TreeNode(8);
    	root.right = q;
    	root.right.left = new TreeNode(7);
    	root.right.right = new TreeNode(9);
    	
    	TreeNode result = EASY_0235_LOWEST_COMMON_ANCESTOR_OF_A_BINARY_SEARCH_TREE.lowestCommonAncestor(root, p, q);
    	Assert.assertEquals(root.val, result.val);
    	result = EASY_0235_LOWEST_COMMON_ANCESTOR_OF_A_BINARY_SEARCH_TREE.lowestCommonAncestor(root, p, q1);
    	Assert.assertEquals(p.val, result.val);
    	
    	
     	
    }
    
   
   
}
