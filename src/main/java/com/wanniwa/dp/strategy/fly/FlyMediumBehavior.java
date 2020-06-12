package com.wanniwa.dp.strategy.fly;

public class FlyMediumBehavior implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("中空飞行 速度2 最高30m");
    }
}
