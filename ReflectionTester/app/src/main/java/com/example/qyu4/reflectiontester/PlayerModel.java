package com.example.qyu4.reflectiontester;


/**
 * Created by qyu4 on 9/30/15.
 */
public class PlayerModel {
    private double singleReactionTime;
    private int count;

    public PlayerModel(double singleReactionTime) {
        this.setSingleReactionTime(singleReactionTime);
    }

    public PlayerModel(int count) {
        this.setCount(count);
    }

    public double getSingleReactionTime() {
        return singleReactionTime;
    }

    public void setSingleReactionTime(double singleReactionTime) {
        this.singleReactionTime = singleReactionTime;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
