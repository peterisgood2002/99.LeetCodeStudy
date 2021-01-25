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
public class EASY_0530_MINIMUM_ABSOLUTE_DIFFERENCE_IN_BST_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0530_MINIMUM_ABSOLUTE_DIFFERENCE_IN_BST_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0530_MINIMUM_ABSOLUTE_DIFFERENCE_IN_BST_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	TreeNode root = new TreeNode(236);
    	root.left = new TreeNode(104);
    	root.left.right = new TreeNode(227);
    	root.right = new TreeNode(701);
    	root.right.right = new TreeNode(911);
    	
    	Assert.assertEquals(9, EASY_0530_MINIMUM_ABSOLUTE_DIFFERENCE_IN_BST.getMinimumDifference(root));
    	
    	root = new TreeNode(1);
    	root.right = new TreeNode(3);
    	root.right.left = new TreeNode(2);
    	
    	Assert.assertEquals(1, EASY_0530_MINIMUM_ABSOLUTE_DIFFERENCE_IN_BST.getMinimumDifference(root));
    	
    }
    
   
   
}
