package com.chou;

import java.math.BigDecimal;

/**
 * @ClassName ReturnCash
 * @Description TODO
 * @Author Axel
 * @Date 2021/5/9 22:54
 * @Version 1.0
 */

public class ReturnCash extends SuperCash{

    private Integer conditionMoney;

    private Integer returnMoney;

    public ReturnCash(Integer conditionMoney, Integer returnMoney) {
        this.conditionMoney = conditionMoney;
        this.returnMoney = returnMoney;
    }

    public ReturnCash(BigDecimal unitPrice, Integer count, Integer conditionMoney, Integer returnMoney) {
        super(unitPrice, count);
        this.conditionMoney = conditionMoney;
        this.returnMoney = returnMoney;
    }

    @Override
    BigDecimal calculationCash() {
        BigDecimal sumPrice = super.getUnitPrice().multiply(BigDecimal.valueOf(super.getCount()));
        if(sumPrice.compareTo(BigDecimal.valueOf(conditionMoney)) > -1){
            return sumPrice.subtract(BigDecimal.valueOf(returnMoney));
        }
        return sumPrice;
    }

    public Integer getConditionMoney() {
        return conditionMoney;
    }

    public void setConditionMoney(Integer conditionMoney) {
        this.conditionMoney = conditionMoney;
    }

    public Integer getReturnMoney() {
        return returnMoney;
    }

    public void setReturnMoney(Integer returnMoney) {
        this.returnMoney = returnMoney;
    }
}
