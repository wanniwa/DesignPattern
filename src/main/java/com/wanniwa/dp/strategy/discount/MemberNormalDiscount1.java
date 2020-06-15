package com.wanniwa.dp.strategy.discount;

import java.math.BigDecimal;

public class MemberNormalDiscount1 implements IDiscountStrategy1 {
    @Override
    public BigDecimal discount(DiscountContext2 discountContext2) {
        String memberType = discountContext2.getMemberType();
        BigDecimal price = discountContext2.getPrice();
        System.out.println(memberType + "没有折扣");
        return price;
    }
}