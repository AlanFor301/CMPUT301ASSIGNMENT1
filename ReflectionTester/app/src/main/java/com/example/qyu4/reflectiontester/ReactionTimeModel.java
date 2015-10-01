package com.example.qyu4.reflectiontester;

/**
 * Created by qyu4 on 9/30/15.
 */
public class ReactionTimeModel {
    double reactionTime;

    public ReactionTimeModel(double reactionTime) {
        this.setReactionTime(reactionTime);
    }

    public double getReactionTime() {
        return reactionTime;
    }

    public void setReactionTime(double reactionTime) {
        this.reactionTime = reactionTime;
    }
}
