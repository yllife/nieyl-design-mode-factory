package com.nieyl.design.mode.factory;

public class PayTest {

    public static void main(String[] args) {
        PaymentFactory dangDangPaymentFactory = new DangDangPaymentFactory();
        dangDangPaymentFactory.createExternalPay().externalPay();
        dangDangPaymentFactory.createInternalPay().internalPay();

        PaymentFactory tMailPaymentFactory = new TMailPaymentFactory();
        tMailPaymentFactory.createInternalPay().internalPay();
        tMailPaymentFactory.createExternalPay().externalPay();
    }
}
