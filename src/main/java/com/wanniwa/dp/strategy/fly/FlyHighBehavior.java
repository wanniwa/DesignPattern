package com.wanniwa.dp.strategy.fly;

public class FlyHighBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("高空飞行 速度3 最高100m");
    }
}
