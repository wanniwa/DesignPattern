package com.wanniwa.dp.strategy.discount;

import java.math.BigDecimal;

public class DiscountContext {

    private IDiscountStrategy discountStrategy;

    public DiscountContext() {
    }

    public DiscountContext(IDiscountStrategy strategy) {
        this.discountStrategy = strategy;
    }

    public void setDiscountStrategy(IDiscountStrategy iDiscountStrategy) {
        this.discountStrategy = iDiscountStrategy;
    }

    public BigDecimal discount(BigDecimal price){
        return discountStrategy.discount(price);
    }
}