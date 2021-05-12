package com.chou;

import java.math.BigDecimal;

/**
 * @ClassName DiscountCash
 * @Description 打折收费子类
 * @Author Axel
 * @Date 2021/5/9 22:31
 * @Version 1.0
 */

public class DiscountCash extends SuperCash{

    private Double ratio;

    public DiscountCash(Double ratio) {
        this.ratio = ratio;
    }

    @Override
    BigDecimal calculationCash() {
        return getUnitPrice().multiply(BigDecimal.valueOf(getCount())).multiply(BigDecimal.valueOf(ratio));
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }
}
