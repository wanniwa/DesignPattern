package com.wanniwa.dp.strategy;

import com.wanniwa.dp.strategy.fly.FlyBehavior;

/**
 * 游戏角色-Context
 */
public class Character1 {
    /**
     * 飞行行为
     */
    private FlyBehavior flyBehavior;

    public Character1() {
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 执行飞的动作
     */
    public void performFly() {
        flyBehavior.fly();
    }
}
