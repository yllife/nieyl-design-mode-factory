package com.nieyl.design.mode.factory;

import com.nieyl.design.mode.factory.external.PayPal;
import com.nieyl.design.mode.factory.internal.WexinPay;

public class DangDangPaymentFactory extends PaymentFactory {

    public IExternalPayment createExternalPay() {
        super.init();
        System.out.println("当当网进入paypal支付环境！");
        return new PayPal();
    }

    public InternalPayment createInternalPay() {
        super.init();
        System.out.println("当当网进入微信支付环境！");
        return new WexinPay();
    }
}
