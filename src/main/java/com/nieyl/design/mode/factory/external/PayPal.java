package com.nieyl.design.mode.factory.external;

import com.nieyl.design.mode.factory.IExternalPayment;

public class PayPal implements IExternalPayment {
    public void externalPay() {
        System.out.println("国外环境使用paypal付款");
    }
}
