package com.wanniwa.dp.strategy.common;

/**
 * 策略上下文
 */
public class StrategyContext {
    //持有一个策略实现的引用
    private IStrategy strategy;
    //使用构造器注入具体的策略类
    public StrategyContext(IStrategy strategy) {
        this.strategy = strategy;
    }

    //也可以通过set方法注入具体策略
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void contextMethod(){
        //调用策略实现的方法
        strategy.algorithmMethod();
    }
}