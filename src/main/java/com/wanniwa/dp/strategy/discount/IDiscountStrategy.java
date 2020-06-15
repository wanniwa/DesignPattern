package com.wanniwa.dp.strategy.discount;

import java.math.BigDecimal;

public interface IDiscountStrategy {
    BigDecimal discount(BigDecimal price);
}