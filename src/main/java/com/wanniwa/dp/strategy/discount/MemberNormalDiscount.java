package com.wanniwa.dp.strategy.discount;

import java.math.BigDecimal;

public class MemberNormalDiscount implements IDiscountStrategy {
    @Override
    public BigDecimal discount(BigDecimal price) {
        System.out.println("普通会员没有折扣");
        return price;
    }
}