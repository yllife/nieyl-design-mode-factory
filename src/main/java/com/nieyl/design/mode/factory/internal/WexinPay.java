package com.nieyl.design.mode.factory.internal;

import com.nieyl.design.mode.factory.InternalPayment;

public class WexinPay implements InternalPayment {
    public void internalPay() {
        System.out.println("国内环境，使用微信付款");
    }
}
