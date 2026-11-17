package com.pluralsight.assets;

import java.math.BigDecimal;

public class Cash extends Asset {
    @Override
    public BigDecimal getValue() {
        return getOriginalCost();
    }
}
