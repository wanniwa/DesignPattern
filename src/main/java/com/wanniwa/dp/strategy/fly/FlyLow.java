package com.wanniwa.dp.strategy.fly;

public class FlyLow implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("低空飞行 速度1 最高10m");
    }
}
