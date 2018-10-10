package com.lin.test.common.entity;

import java.math.BigDecimal;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-07-11 11:39
 **/
public class Result {

    private double outcome;

    private double income;

    private double expect;

    private BigDecimal rate;

    private BuyScheme buyScheme;

    public BuyScheme getBuyScheme() {
        return buyScheme;
    }

    public void setBuyScheme(BuyScheme buyScheme) {
        this.buyScheme = buyScheme;
    }

    public double getOutcome() {
        return outcome;
    }

    public void setOutcome(double outcome) {
        this.outcome = outcome;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getExpect() {
        return expect;
    }

    public void setExpect(double expect) {
        this.expect = expect;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
}
