package com.kodilla.patterns2.facade.api;

public class OrderProcesingExecption extends Exception {

    public static String ERR_NOT_AUTHORISED = "User is not authorised";
    public static String ERR_PAYMENT_REJECTED = "Payment was rejected";
    public static String ERR_VERIFICATION_ERROR = "Verificatin error";
    public static String ERR_SUBMITTING_ERROR = "Cannot submit order";

    public OrderProcesingExecption(String message) {
        super(message);
    }
}
