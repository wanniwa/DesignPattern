package com.wanniwa.dp.strategy.fly;

public class FlyMedium implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("中空飞行 速度2 最高30m");
    }
}
