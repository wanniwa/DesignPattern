package com.wanniwa.dp.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PriceCenter {
    /**
     * 对原价进行折扣计算
     * @param price 原价
     * @param memberType 会员类型
     * @return 计算折扣后价格
     */
    public BigDecimal discount(BigDecimal price, String memberType){
        if ("普通会员".equals(memberType)) {
            System.out.println("抱歉！普通会员没有折扣！");
            return price;
        }else if ("VIP会员".equals(memberType)) {
            System.out.println("vip会员打9折！");
            price = price.multiply(new BigDecimal("0.9")).setScale(2, RoundingMode.HALF_UP);
            return price;
        }else if("超级VIP会员".equals(memberType)){
            System.out.println("超级VIP会员打5折！");
            price = price.multiply(new BigDecimal("0.5")).setScale(2,RoundingMode.HALF_UP);
            return price;
        }
        // 不支持的会员类型都是原价
        return price;
    }
}
