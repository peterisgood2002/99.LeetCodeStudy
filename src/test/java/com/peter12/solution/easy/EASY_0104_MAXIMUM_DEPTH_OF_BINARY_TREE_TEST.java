package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.data.TreeNode;
import com.peter12.solution.easy.EASY_0020_VALID_PARENTHESES;
import com.peter12.solution.util.ArrayUtil;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EASY_0104_MAXIMUM_DEPTH_OF_BINARY_TREE_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0104_MAXIMUM_DEPTH_OF_BINARY_TREE_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0104_MAXIMUM_DEPTH_OF_BINARY_TREE_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	TreeNode tree = createTree();
    	Assert.assertEquals( 3, EASY_0104_MAXIMUM_DEPTH_OF_BINARY_TREE.maxDepth(tree) );
    	
    	int[] nums1 = new int[] {0};
    	
    	TreeNode t1 = TreeNode.createTreeNode(nums1);
    	Assert.assertEquals( 1, EASY_0104_MAXIMUM_DEPTH_OF_BINARY_TREE.maxDepth(t1) );
    	
    	
    	nums1 = new int[] {1, 2, 2, 3, 4, 4, 3};
    	
    	t1 = TreeNode.createTreeNode(nums1);
    	Assert.assertEquals( 3, EASY_0104_MAXIMUM_DEPTH_OF_BINARY_TREE.maxDepth(t1) );
    	
    	nums1 = new int[] {1, 2, 2, 3, 4, 4, 3, 4};
    	
    	t1 = TreeNode.createTreeNode(nums1);
    	Assert.assertEquals( 4, EASY_0104_MAXIMUM_DEPTH_OF_BINARY_TREE.maxDepth(t1) );
    	
    	
    }
  
    public static TreeNode createTree() {
    	TreeNode result = new TreeNode(3);
    	result.left = new TreeNode(9);
    	
    	result.right = new TreeNode(20);
    	result.right.left = new TreeNode(15);
    	result.right.right = new TreeNode(7);
    	
    	return result;
    }
}
