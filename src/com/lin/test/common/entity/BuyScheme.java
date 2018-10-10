package com.lin.test.common.entity;

import com.lin.test.worldcup.SingleScore;

import java.util.List;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-07-11 10:40
 **/
public class BuyScheme {

    private List<SingleScore> incomes;

    private WinLose winlose;

    public List<SingleScore> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<SingleScore> incomes) {
        this.incomes = incomes;
    }

    public WinLose getWinlose() {
        return winlose;
    }

    public void setWinlose(WinLose winlose) {
        this.winlose = winlose;
    }
}
