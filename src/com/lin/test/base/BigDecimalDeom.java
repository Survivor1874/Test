package com.lin.test.base;

import java.math.BigDecimal;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-07-11 10:29
 **/
public class BigDecimalDeom {

        public static void main(String[] args) {

            System.out.println(0.09 + 0.01);

            System.out.println(1.0 - 0.32);

            System.out.println(1.015 * 100);

            System.out.println(1.301 / 100);



            // public BigDecimal add(BigDecimal augend):加

            BigDecimal bd1 = new BigDecimal("0.09");

            BigDecimal bd2 = new BigDecimal("0.01");

            System.out.println("add:" + bd1.add(bd2));

            System.out.println("----------------------");

            // public BigDecimal subtract(BigDecimal subtrahend):减

            BigDecimal bd3 = new BigDecimal("1.0");

            BigDecimal bd4 = new BigDecimal("0.32");

            System.out.println("subtract:" + bd3.subtract(bd4));

            System.out.println("----------------------");

            // public BigDecimal multiply(BigDecimal multiplicand):乘

            BigDecimal bd5 = new BigDecimal("1.015");

            BigDecimal bd6 = new BigDecimal("100");

            System.out.println("multiply:" + bd5.multiply(bd6));

            System.out.println("----------------------");

            // public BigDecimal divide(BigDecimal divisor):除

            BigDecimal bd7 = new BigDecimal("1.301");

            BigDecimal bd8 = new BigDecimal("100");

            System.out.println("divide:" + bd7.divide(bd8));

            System.out.println("divide:" + bd7.divide(bd8,3,BigDecimal.ROUND_HALF_UP));

            System.out.println("divide:" + bd7.divide(bd8,9,BigDecimal.ROUND_HALF_UP));

        }


}
