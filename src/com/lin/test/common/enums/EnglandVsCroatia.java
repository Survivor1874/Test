package com.lin.test.common.enums;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-07-11 09:43
 **/
public enum EnglandVsCroatia {

    ZERO_ZERO("0:0", 7.5),
    ZERO_ONE("0:1", 6.0),
    ZERO_TWO("0:2", 10.5),
    ONE_ZERO("1:0", 8.5),
    ONE_ONE("1:1", 6.3),
    ONE_TWO("1:2", 9.8),
    TWO_ZERO("2:0", 19),
    TWO_ONE("2:1", 13.5),
    TWO_TWO("2:2", 4.5),
    ZERO_THREE("0:3", 26),
    ZERO_FOUR("0:4", 71),
    ZERO_FIVE("0:5", 3),
    ONE_THREE("1:3", 26),
    ONE_FOUR("1:4", 71),
    ONE_FIVE("1:5", 3),
    TWO_THREE("2:3", 41),
    TWO_FOUR("2:4", 111),
    TWO_FIVE("2:5", 3),
    THREE_ZERO("3:0", 61),
    THREE_ONE("3:1", 41),
    THREE_TWO("3:2", 51),
    THREE_THREE("3:3", 91),
    THREE_FOUR("3:4", 221),
    THREE_FOURFOUR("3:5", 3),
    FOUR_ZERO("4:0", 221),
    FOUR_ONE("4:1", 131),
    FOUR_TWO("4:2", 201),
    FOUR_THREE("4:3", 251),
    FOUR_FOUR("4:4", 221),
    FOUR_FIVE("4:5", 3),
    FIVE_ZERO("5:0", 3),
    FIVE_ONE("5:1", 3),
    FIVE_TWO("5:2", 3),
    FIVE_THREE("5:3", 3),
    FIVE_FOUR("5:4", 3),
    FIVE_FIVE("5:5", 3);


    private String score;

    private double odds;

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public double getOdds() {
        return odds;
    }

    public void setOdds(double odds) {
        this.odds = odds;
    }

    EnglandVsCroatia(String score, double odds) {
        this.score = score;
        this.odds = odds;
    }

    public static double getFromScore(String score) {
        for (EnglandVsCroatia value : EnglandVsCroatia.values()) {
            if(score.equalsIgnoreCase(value.getScore())) {
                return value.getOdds();
            }
        }
        return 0;
    }
}
