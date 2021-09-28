/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thienan.mathutil.core;

/**
 *
 * @author antru
 */
public class MathUtil {
    //viết hàm toán học tính giai thừ n! = 1.2.3....n
    //quy ước: 0! - 1! - 1
    //ko có giai thừa của số âm
    //21! tràn kiểu long, long: 10 số 0
    //tóm lại: hàm tính giai thừ của n - 20
    //Ta xài luôn kĩ thuật lập trình TDD_Toast Driven Development
    //ta nghĩ về test, kịch bản test, bộ dữ liệu test trước khi code
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("n must be between 0..20");
        
        if (n==0) {
            return 1;
        }
        long product = 1;
        
        for (int i = 2; i <= n; i++) 
            product *= i;
        
        return product;
    }
    
    //sure, getF(5) -> 120
    //      getF(6) -> 720
}
