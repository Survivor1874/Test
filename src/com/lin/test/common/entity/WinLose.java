package com.lin.test.common.entity;

import com.lin.test.common.enums.WinLoseEnum;

import java.io.Serializable;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-07-11 10:43
 **/
public class WinLose implements Serializable {

    private int type;

    private int winloseCount;

    private double probability;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getWinloseCount() {
        return winloseCount;
    }

    public void setWinloseCount(int winloseCount) {
        this.winloseCount = winloseCount;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public double winLoseResult() {
        double odds = WinLoseEnum.fromType(type);
        return odds*winloseCount;
    }
}
