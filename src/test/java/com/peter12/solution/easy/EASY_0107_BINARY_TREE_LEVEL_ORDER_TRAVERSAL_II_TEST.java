package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.data.TreeNode;
import com.peter12.solution.easy.EASY_0020_VALID_PARENTHESES;
import com.peter12.solution.util.Util;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EASY_0107_BINARY_TREE_LEVEL_ORDER_TRAVERSAL_II_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0107_BINARY_TREE_LEVEL_ORDER_TRAVERSAL_II_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0107_BINARY_TREE_LEVEL_ORDER_TRAVERSAL_II_TEST.class );
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
    	List<List<Integer>> ans = createAnswer();
    	
    	Assert.assertTrue( Util.equalsForList(ans, EASY_0107_BINARY_TREE_LEVEL_ORDER_TRAVERSAL_II.levelOrderBottom(tree) )  );
    	
    	int[] nums1 = new int[] {1, 2, 2, 3, 4, 4, 3};
    	
    	tree = TreeNode.createTreeNode(nums1);
    	ans = createAnswer2();
    	Assert.assertTrue( Util.equalsForList(ans, EASY_0107_BINARY_TREE_LEVEL_ORDER_TRAVERSAL_II.levelOrderBottom(tree) )  );
    	
    	
    }
  
    public static TreeNode createTree() {
    	TreeNode result = new TreeNode(3);
    	result.left = new TreeNode(9);
    	
    	result.right = new TreeNode(20);
    	result.right.left = new TreeNode(15);
    	result.right.right = new TreeNode(7);
    	
    	return result;
    }
    
    public static List<List<Integer>> createAnswer() {
    	List<List<Integer>> result = new Vector<List<Integer>>();
    	
    	List<Integer> r1 = new Vector<Integer>();
    	r1.add(15);
    	r1.add(7);
    	result.add(r1);
    	
    	r1 = new Vector<Integer>();
    	r1.add(9);
    	r1.add(20);
    	result.add(r1);
    	
    	r1 = new Vector<Integer>();
    	r1.add(3);
    	result.add(r1);
    	
    	return result;
    }
    
    public static List<List<Integer>> createAnswer2() {
    	List<List<Integer>> result = new Vector<List<Integer>>();
    	
    	List<Integer> r1 = new Vector<Integer>();
    	r1.add(3);
    	r1.add(4);
    	r1.add(4);
    	r1.add(3);
    	result.add(r1);
    	
    	r1 = new Vector<Integer>();
    	r1.add(2);
    	r1.add(2);
    	result.add(r1);
    	
    	r1 = new Vector<Integer>();
    	r1.add(1);
    	result.add(r1);
    	
    	return result;
    }
}
