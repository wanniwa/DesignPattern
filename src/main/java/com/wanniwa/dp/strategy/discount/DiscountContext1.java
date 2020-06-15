package com.wanniwa.dp.strategy.discount;

import java.math.BigDecimal;

public class DiscountContext1 {

    String memberType;

    private IDiscountStrategy discountStrategy;

    public DiscountContext1(String memberType) {
        this.memberType = memberType;
        this.discountStrategy = MemberDiscountFactory.getDiscountStrategy(memberType);
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public IDiscountStrategy getDiscountStrategy() {
        return discountStrategy;
    }

    public BigDecimal discount(BigDecimal price){
        return discountStrategy.discount(price);
    }
}