package com.wanniwa.dp.strategy.discount;

import java.math.BigDecimal;

public class Client3 {
    public static void main(String[] args) {
        //这里使用最简单方式表示类型
        String memberType = "normal";
        //原价
        BigDecimal price = new BigDecimal(1000);
        DiscountContext2 discountContext = new DiscountContext2(memberType);
        BigDecimal result = discountContext.discount(price);
        System.out.println("打折后的价格为"+result);
    }
}
