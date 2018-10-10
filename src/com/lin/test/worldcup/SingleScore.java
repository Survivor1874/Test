package com.lin.test.worldcup;

import com.lin.test.common.enums.EnglandVsCroatia;

import java.io.Serializable;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-07-11 10:51
 **/
public class SingleScore implements Serializable {

    private String score;

    private int singleScoreCount;

    private double probability;

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public int getSingleScoreCount() {
        return singleScoreCount;
    }

    public void setSingleScoreCount(int singleScoreCount) {
        this.singleScoreCount = singleScoreCount;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public double singleScoreResult() {
        double fromScore = EnglandVsCroatia.getFromScore(score);
        return fromScore*singleScoreCount;
    }
}
