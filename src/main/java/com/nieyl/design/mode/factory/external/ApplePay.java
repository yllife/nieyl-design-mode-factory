package com.nieyl.design.mode.factory.external;

import com.nieyl.design.mode.factory.IExternalPayment;

public class ApplePay implements IExternalPayment {
    public void externalPay() {
        System.out.println("国外环境使用苹果支付付款");
    }
}
