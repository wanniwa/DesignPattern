package com.wanniwa.dp.strategy.discount;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MemberInnerDiscount implements IDiscountStrategy {
    @Override
    public BigDecimal discount(BigDecimal price) {
        System.out.println("内部会员打5折！");
        price = price.multiply(new BigDecimal("0.5")).setScale(2, RoundingMode.HALF_UP);
        return price;
    }
}