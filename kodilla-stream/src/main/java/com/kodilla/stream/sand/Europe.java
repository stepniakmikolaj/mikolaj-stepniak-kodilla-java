package com.kodilla.stream.sand;

import java.math.BigDecimal;

public class Europe implements SandStorage {

    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("78945612307894561230");
        return sandQuantity;
    }
}
