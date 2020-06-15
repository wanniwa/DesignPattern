package com.wanniwa.dp.strategy.discount;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MemberSuperVIPDiscount implements IDiscountStrategy {
    @Override
    public BigDecimal discount(BigDecimal price) {
        System.out.println("超级VIP会员打8折！");
        price = price.multiply(new BigDecimal("0.8")).setScale(2, RoundingMode.HALF_UP);
        return price;
    }
}