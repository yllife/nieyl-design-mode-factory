package com.nieyl.design.mode.factory;

import com.nieyl.design.mode.factory.external.ApplePay;
import com.nieyl.design.mode.factory.internal.AliPay;
import com.nieyl.design.mode.factory.internal.WexinPay;

public class TMailPaymentFactory extends PaymentFactory {
    public IExternalPayment createExternalPay() {
        super.init();
        System.out.println("天猫商城使用苹果支付环境");
        return new ApplePay();
    }

    public InternalPayment createInternalPay() {
        super.init();
        System.out.println("天猫商城使用支付宝支付环境");
        return new AliPay();
    }
}
