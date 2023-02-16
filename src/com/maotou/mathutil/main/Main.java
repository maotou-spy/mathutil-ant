/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.maotou.mathutil.main;

import com.maotou.mathutil.core.MathUtility;

/**
 *
 * @author Yemufu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        testFactorialGivenRightArgumentRunsWell();
        testFactorialGivenWrongAgumentThrowException();
    }
    
    //dân Dev phải có trách nhiệm test code của mình chạy đúng hay sai
    //trước khi lắp ráp nó với cách class khác để hình thành nên các chức năng
    //có nhiều quy tắc đặt tên hàm cho việc kiểm thử hàm
    //thường tên hàm sẽ bao hàm ý nghĩa của việc kiếm thử
    //vi dụ hàm dưới này sẽ dùng để test cái hàm tính giai thừa
    //trong tình huống - case đưa n đúng chuẩn, thì ta hy vọng -expected
    //hàm chạy ngon như thiết kế, ví dụ n = 5 thì hàm phải trả về 120
    //tức là 5! hy vọng hàm tinh ra 120
    public static void testFactorialGivenRightArgumentRunsWell(){
        //test case #1: Test getFactorial with n = 0
        //Expected value: 1 - hy vọng đưa n = 0 vào thì hàm trả vêf 1
        
        int n = 0;
        long expectedValue = 1;
        long acualValue = MathUtility.getFactorial(n);
        
        System.out.println("Test" + n + "!: expected = " + expectedValue 
                                         + " | actual: " + acualValue);
        
        //Test case 2: test get factorial with n = 1
        //Expected value = 1
        n = 1;
        expectedValue = 1;
        acualValue = MathUtility.getFactorial(n);
        System.out.println("Test" + n + "!: expected = " + expectedValue 
                                         + " | actual: " + acualValue);
        
        //Test case 3: test get factorial with n = 3
        //Expected value = 6
        n = 3;
        expectedValue = 6;
        acualValue = MathUtility.getFactorial(n);
        System.out.println("Test" + n + "!: expected = " + expectedValue 
                                         + " | actual: " + acualValue);
    }
    
    //thiet ke ham getF() la chi tinh n! tu 0..20
    //Neu dua n<0 hoac n>20 thi ham se khoong tinh, chui 
    //                          bang cach nem ra ngoai le !!!
    //Thuc te ham getF khi chay co lam ddc nhu thiet ke hay ko thi phai chay thu moi biet dc
    public static void testFactorialGivenWrongAgumentThrowException(){
        //Test case #4: Test getF() with n = -5, wrong agument
        //Expected value: an exception is thrown
        //                  IllegalArgumentException
        
        System.out.println("Test -5: expected = Illegal Argument Exception");
        MathUtility.getFactorial(-5);
    }
}
