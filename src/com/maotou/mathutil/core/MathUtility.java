/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maotou.mathutil.core;

/**
 *
 * @author Yemufu
 */
public class MathUtility {

    public static final double PI = 3.1415;

    //Ham tinh n! = 1*2*3*..*n
    //khong co giai thua cho so am
    //0! = 1! = 1
    //Vi giai thua tang gia tri rat la nhanh, 20! vua du 18 so 0
    //tuc la 21! tran kieu long
    //=>Ham nay quy uoc chi tinh tu 0..20
    //co 2 cach viet ham nay: for truyen thong va de quy - recursion
    public static final long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20!");

        if (n == 0 || n == 1) 
            return 1;

        long product = 1;

        for (int i = 2; i <= n; i++) 
            product *= i;

        return product;
    }

}
