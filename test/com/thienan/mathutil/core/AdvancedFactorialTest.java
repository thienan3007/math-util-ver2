/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thienan.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

/**
 *
 * @author antru
 */

//Ta sẽ dùng kĩ thuật Data Driven Testing/Parameterized Testing
//tham số hóa bộ dữ liệu Test
//tách là kĩ thuật tách bộ dữ liệu test ra hẳng câu lệnh kiểm thừ hàm

//xét cho bài getF()
//bộ data:
// 0 -> 1;
//1 -> 1;
//2 -> 2;
//3 -> 6;

//nhồi/fill bộ data vòa trong lời gọi hàm getF() | assertEquals

@RunWith(value = Parameterized.class)
public class AdvancedFactorialTest {
    
    //chuan bi bộ data trước, ở txt, excel, database
    //nếu để tile ngoài, thì viết thêm đoạn code đọc data vào 
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][] {
            {0, 1}, {1,1}, {2,2}, {3,6}, {4,24}, {5,720} //bo sung de test CI
        };
    }
    
    @Parameter(value = 0)
    public int n;// ban muon tinh may giai thua
    
    @Parameter(value = 1)
    public long expected;// ban ki vong giai thua tra ve may
    
    @Test
    public void checkfatorialGivenRightArgumentReturnsWell() {
        assertEquals(expected, MathUtil.getFactorial(n));
    }
    //chọn 1 Unit Test frameword bất kì bạn thích, tùy theo ngôn ngữ lập trình
    //demo về Framework đó
    /*
        C#: NUnit, xUnit, MSTest
        J: TestNG
    
        Demo phải có code
            + Nên lấy phần môn SWP, JW, demo trong DAO, các class mà có xử
              lí trả về giá trị
            + Code có ý nghĩa, đừng chơi add(a,b), sub(a,b)
    
    Deadline: Thứ 3 tuần thứ 5
    */
}
