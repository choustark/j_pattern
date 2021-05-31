package com.chou;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 需求： 一个收银台计费软件
 * 1、输入单价输入数量 计算价格
 * 2、添加折扣信息
 *  2.0 正常收费
 *  2.1 打五折
 *  2.2 满500减50
 *  2.3 打八折
 *  2.4 打七折
 */
public class AppClient {
    public static void main( String[] args ) {
        SuperCash cash;
        BigDecimal priceResult = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("购买数量...");
        Integer buyNum = scanner.nextInt();
        System.out.println("商品单价...");
        BigDecimal goodUnitPrice = scanner.nextBigDecimal();
        System.out.println("输入折扣信息");
        String discountInfo = scanner.next();
        switch (discountInfo){
            case "正常收费":
                cash = new NormalCash(goodUnitPrice,buyNum);
                cash.setUnitPrice(goodUnitPrice);
                cash.setCount(buyNum);
                priceResult = new CashContext(cash).getPriceResult();
                System.out.println("应收费用："+ priceResult);
                break;
            case "打五折":
                cash = new DiscountCash(0.5);
                cash.setCount(buyNum);
                cash.setUnitPrice(goodUnitPrice);
                priceResult = new CashContext(cash).getPriceResult();
                System.out.println("应收费用："+ priceResult);
                break;
            case "打八折":
                new CashContext(new DiscountCash(0.8)).getPriceResult();
                break;
            case "打七折":
                new CashContext(new DiscountCash(0.7)).getPriceResult();
                break;
            case  "满500减50":
                new CashContext(new ReturnCash(500,50)).getPriceResult();
                break;
            default:
                System.out.println("没有相关的折扣信息...");
               break;
        }
    }
}
