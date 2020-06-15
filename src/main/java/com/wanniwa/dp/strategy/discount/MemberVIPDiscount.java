package com.wanniwa.dp.strategy.discount;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MemberVIPDiscount implements IDiscountStrategy {
    @Override
    public BigDecimal discount(BigDecimal price) {
        System.out.println("vip会员打9折！");
        price = price.multiply(new BigDecimal("0.9")).setScale(2, RoundingMode.HALF_UP);
        return price;
    }
}