/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thienan.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author antru
 */
public class FactorialTest {
    
    @Test //biến 1 hàm đi kèm cái Annotation này thành hàm main()
    public void checkFatorialGivenRightArgumentReturnsWell() {
        long expected = 120; // tui kì vọng 120 trả về
        long actual = MathUtil.getFactorial(5);// nếu tui tính 5!
        
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(720, MathUtil.getFactorial(6));
        Assert.assertEquals(1, MathUtil.getFactorial(0));
        
    }
    
    // bắt xem, test xem hàm có ném về ngoại lệ như kì vọng hay ko
    // ví dụ nếu ta tính getF(5) -> thề, ném ra ngoại lệ
    // nếu đúng gọi hàm getF(-5) mà hàm ném ra ngoại lệ tương ứng 
    //-> hàm viết đúng, ta có màu xanh. 
    // hàm được thiết kế đưa âm ném ngoại lệ, thực sự khi chạy nó ném ra thật
    // có nghĩa hàm đúng, như kì vọng, thì màu xanh,
    //JUnit 4 coi ngoại lệ ko là giá trị, ko AssertEquals(ngoại lệ, actual)
    
    @Test(expected = IllegalArgumentException.class)
    public void checkFatorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);//phải ném ngoại lệ mới là đúng
    }
    
}
//Chốt hạ cho xanh đỏ
//XANH: khi tất cả các tình huống test phải là màu xanh, tức là mọi expectd
//và actual phải khớp nhau

//ĐỎ: chỉ cần 1 cái đỏ -> tất cả coi như là đỏ

//LOGIC: Hàm đã đúng thì phải đúng cho mọi dữ liệu mà ta đã test
//       Không chấp nhận lúc đúng lúc sai
