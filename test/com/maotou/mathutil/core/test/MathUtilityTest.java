/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.maotou.mathutil.core.test;

import com.maotou.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Yemufu
 */
public class MathUtilityTest {
    
    @Test
    //Trong ham nay se chua cac testcase de chua getF()
    //voi n hop le trong khoang 0..20
    public void testFactorialGivenRightArgumentReturnsWell(){
        
        //Test case #1: test getF() with n = 0
        //Expected value = 1 //Hy vong 0! = 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactorial(n);
        
        Assert.assertEquals(expectedValue, expectedValue);
        
        //Test case #2: test getF() with n = 5
        //Expected value = 1 //Hy vong 5! = 120
        
        Assert.assertEquals(120, MathUtility.getFactorial(5));
        
        //Test case #3: test getF() with n = 6
        //Expected value = 1 //Hy vong 6! = 720
        
        Assert.assertEquals(720, MathUtility.getFactorial(6));
        
        //Test case #4: test getF() with n = 4
        //Expected value = 1 //Hy vong 4! = 24
        
        Assert.assertEquals(24, MathUtility.getFactorial(4));
    }
    
}
