package com.abcd.test.netty;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    @Test
    public void testRound(){
    	System.out.println("12.5的四舍五入值：" + Math.round(12.5));
        System.out.println("-12.5的四舍五入值：" + Math.round(-12.5));
    }
    
    @Test
    public void testHALF_EVEN(){
    	/*BigDecimal d = new BigDecimal(100000);      //存款
        BigDecimal r = new BigDecimal(0.001875*3);   //利息
        BigDecimal i = d.multiply(r).setScale(2,RoundingMode.HALF_EVEN);     //使用银行家算法 

        System.out.println("季利息是："+i);*/
    	double   f   =   111231.5585;
        BigDecimal   b   =   new   BigDecimal(f);
        double   f1   =   b.setScale(2,   RoundingMode.HALF_UP).doubleValue();
        System.out.println(new java.text.DecimalFormat("#.000").format(3.1415926));
    }
}
