package com.peter12.solution.easy;

import java.util.List;
import java.util.Vector;

import com.peter12.solution.data.ListNode;
import com.peter12.solution.easy.EASY_0020_VALID_PARENTHESES;
import com.peter12.solution.util.ArrayUtil;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EASY_0066_PLUS_ONE_TEST 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public EASY_0066_PLUS_ONE_TEST( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( EASY_0066_PLUS_ONE_TEST.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    
    public static void testGetResult() {
    	
    	int[] digits = new int[] {0, 9};
    	int[] result = new int[] {1 ,0};
    	Assert.assertTrue( ArrayUtil.equalsForArray(result, EASY_0066_PLUS_ONE.plusOne(digits)));
    	
    	digits = new int[] {0, 0};
    	result = new int[] {0 ,1};
    	Assert.assertTrue( ArrayUtil.equalsForArray(result, EASY_0066_PLUS_ONE.plusOne(digits)));
    	
    	digits = new int[] {9, 9};
    	result = new int[] {1 ,0, 0};
    	Assert.assertTrue( ArrayUtil.equalsForArray(result, EASY_0066_PLUS_ONE.plusOne(digits)));
    	
    	digits = new int[] {9,8,7,6,5,4,3,2,1,0};
    	result = new int[] {9,8,7,6,5,4,3,2,1,1};
    	Assert.assertTrue( ArrayUtil.equalsForArray(result, EASY_0066_PLUS_ONE.plusOne(digits)));
    	
    	
    	digits = new int[] {1, 0, 1};
        result = new int[] {1, 0, 2};
    	Assert.assertTrue( ArrayUtil.equalsForArray(result, EASY_0066_PLUS_ONE.plusOne(digits)));
    	
    	digits = new int[] {1, 2, 3};
        result = new int[] {1, 2, 4};
    	Assert.assertTrue( ArrayUtil.equalsForArray(result, EASY_0066_PLUS_ONE.plusOne(digits)));
    	
    	digits = new int[] {4, 3, 2, 1};
    	result = new int[] {4, 3, 2, 2};
    	Assert.assertTrue( ArrayUtil.equalsForArray(result, EASY_0066_PLUS_ONE.plusOne(digits)));
    	
    	digits = new int[] {0};
    	result = new int[] {1};
    	Assert.assertTrue( ArrayUtil.equalsForArray(result, EASY_0066_PLUS_ONE.plusOne(digits)));
    	
    	
    	
    	
    }
    
}
