package com.github.chuangkel.mybatisgenerator.praser;

/**
 * @program: pms2.0_analyze
 * @description:
 * @author: chuangkel
 * @create: 2019-05-13
 **/
public enum NumberFeild {

    shareRatio("shareRatio", 1);

    private String feild;

    private int positions;


    NumberFeild(String feild, int positions) {
        this.feild = feild;
        this.positions = positions;
    }

    public String getFeild() {
        return feild;
    }

    public void setFeild(String feild) {
        this.feild = feild;
    }

    public int getPositions() {
        return positions;
    }

    public void setPositions(int positions) {
        this.positions = positions;
    }


}
