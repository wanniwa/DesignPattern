package com.wanniwa.dp.strategy.discount;

import java.util.HashMap;
import java.util.Map;

/**
 * 会员折扣策略工厂
 */
public class MemberDiscountFactory1 {
    private static final Map<String, IDiscountStrategy1> map = new HashMap<>();
    static {
        map.put("normal", new MemberNormalDiscount1());
    }
    public static IDiscountStrategy1 getDiscountStrategy(String memberType) {
        return map.get(memberType);
    }
}
