package com.wanniwa.dp.strategy.discount;

import java.util.HashMap;
import java.util.Map;

/**
 * 会员折扣策略工厂
 */
public class MemberDiscountFactory {
    private static final Map<String, IDiscountStrategy> map = new HashMap<>();
    static {
        map.put("normal", new MemberNormalDiscount());
        map.put("VIP", new MemberVIPDiscount());
        map.put("superVIP", new MemberSuperVIPDiscount());
    }
    public static IDiscountStrategy getDiscountStrategy(String memberType) {
        return map.get(memberType);
    }
}
