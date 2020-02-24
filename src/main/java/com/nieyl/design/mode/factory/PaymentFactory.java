package com.nieyl.design.mode.factory;

public abstract class PaymentFactory {

    public void init(){
        System.out.println("进入支付安全准备工作！");
    }

    public abstract IExternalPayment createExternalPay();

    public abstract InternalPayment createInternalPay();
}
