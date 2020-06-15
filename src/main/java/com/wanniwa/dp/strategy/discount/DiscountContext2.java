package com.wanniwa.dp.strategy.discount;

import java.math.BigDecimal;

public class DiscountContext2 {

    private String memberType;

    private BigDecimal price;

    private IDiscountStrategy1 discountStrategy;

    public DiscountContext2(String memberType) {
        this.memberType = memberType;
        this.discountStrategy = MemberDiscountFactory1.getDiscountStrategy(memberType);
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public IDiscountStrategy1 getDiscountStrategy() {
        return discountStrategy;
    }

    public BigDecimal discount(BigDecimal price){
        this.price = price;
        return discountStrategy.discount(this);
    }
}