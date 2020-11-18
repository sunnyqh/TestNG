package com.demo;

import com.sun.org.glassfish.gmbal.Description;
import com.unit.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * @author EvnTest
 * @Title:
 * @Package
 * @Description:
 * @date 2020/11/17
 **/
public class EvnTest {
    @Test
    public void clearTest(){
        Calculator.clear();
    }

    @Test
    public void addTest(){
        SoftAssert assertion = new SoftAssert();
        int result01= Calculator.add(4,2);
        System.out.print(result01+"\r\n");
        assertion.assertEquals(5,result01);
        int result02= Calculator.add(4,2);
        System.out.print(result02);
        assertion.assertEquals(6,result02);

    }
    @Test
    public void subTractTest(){
        int result= Calculator.subtract(4,2);
        System.out.print(result);
        Assert.assertEquals(result,2);
    }
    @Test
    public void multiplyTest(){
        int result= Calculator.multiply(4,2);
        System.out.print(result);
        Assert.assertEquals(result,8);
    }
    @Test
    public void divideTest(){
        int result= Calculator.divide(4,2);
        System.out.print(result);
        Assert.assertEquals(result,2);
    }
    @Test
    public void countTest() throws InterruptedException {
        int result= Calculator.count(1);
        System.out.print(result);
    }


}
