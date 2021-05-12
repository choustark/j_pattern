package com.chou;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @ClassName SuperCash
 * @Description  收费抽象
 * @Author Axel
 * @Date 2021/5/8 9:01
 * @Version 1.0
 */

public abstract class SuperCash {
    // 单价
    private BigDecimal unitPrice;
    // 数量
    private Integer count;

    public SuperCash() {

    }

    public SuperCash(BigDecimal unitPrice, Integer count) {
        this.unitPrice = unitPrice;
        this.count = count;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getCount() {
        return count;
    }

    /**
     * 计算价格 由子类实现
     *
     * @return
     */
    abstract BigDecimal calculationCash();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuperCash superCash = (SuperCash) o;
        return Objects.equals(unitPrice, superCash.unitPrice) &&
                Objects.equals(count, superCash.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unitPrice, count);
    }
}
