package com.chou;

import java.math.BigDecimal;

/**
 * @ClassName CashContext
 * @Description TODO
 * @Author Axel
 * @Date 2021/5/10 0:01
 * @Version 1.0
 */

public class CashContext {
    SuperCash cash;

    public CashContext(SuperCash cash) {
        this.cash = cash;
    }

    public BigDecimal getPriceResult(){
        return cash.calculationCash();
    }
}
