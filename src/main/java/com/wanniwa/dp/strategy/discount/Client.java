package com.wanniwa.dp.strategy.discount;

import java.math.BigDecimal;

public class Client {
    public static void main(String[] args) {
        //会员类型
        String memberType = "VIP";
        //原价
        BigDecimal price = new BigDecimal(1000);
        DiscountContext discountContext = new DiscountContext();
        if ("normal".equals(memberType)) {
            MemberNormalDiscount memberNormalDiscount = new MemberNormalDiscount();
            discountContext.setDiscountStrategy(new MemberNormalDiscount());
            price = discountContext.discount(price);
        } else if ("VIP".equals(memberType)) {
            BigDecimal price2 = new BigDecimal(1000);
            discountContext.setDiscountStrategy(new MemberSuperVIPDiscount());
            price = discountContext.discount(price);
        }else if ("superVIP".equals(memberType)) {
            discountContext.setDiscountStrategy(new MemberInnerDiscount());
            price = discountContext.discount(price);
        }
        System.out.println(price);
    }
}
