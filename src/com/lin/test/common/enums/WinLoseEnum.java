package com.lin.test.common.enums;

/**
 * @author linjun.li@quvideo.com
 * @date 2018-07-11 11:26
 **/
public enum WinLoseEnum {

    E_WIN_C(1, 2.3),
    E_LOSE_C(0,3.45),
    E_EQUAL_C(2, 3.15);
    
    private int type;

    private double odds;

    WinLoseEnum(int type, double odds) {
        this.type = type;
        this.odds = odds;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getOdds() {
        return odds;
    }

    public void setOdds(double odds) {
        this.odds = odds;
    }
    
    public static double fromType(Integer type) {
        for (WinLoseEnum winLoseEnum : WinLoseEnum.values()) {
            if(type.equals(winLoseEnum.getType())) {
               return winLoseEnum.getOdds();
            }
        }

        return 0;
    }
}
