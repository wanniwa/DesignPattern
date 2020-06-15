package com.wanniwa.dp.strategy.common;

// 具体的策略实现A
public class ConcreteStrategyA implements IStrategy {
    //具体的算法实现
    @Override
    public void algorithmMethod() {
        System.out.println("我是具体的算法A");
    }
}