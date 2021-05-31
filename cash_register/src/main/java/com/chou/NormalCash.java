package com.chou;

import java.math.BigDecimal;

/**
 * @ClassName NormalCash
 * @Description 正常的收费 的子类
 * @Author Axel
 * @Date 2021/5/8 9:26
 * @Version 1.0
 */

public class NormalCash extends SuperCash {

    public NormalCash() {
    }

    public NormalCash(BigDecimal unitPrice, Integer count) {
        super(unitPrice, count);
    }

    @Override
    BigDecimal calculationCash() {
        return super.getUnitPrice().multiply(BigDecimal.valueOf(super.getCount()));
    }
}
