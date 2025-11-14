package org.example.patterns.adapter;

import java.util.UUID;

public class LegacyPaymentProcessor {

    public String process(double amount, String cardNumber, String currency) {

        if (amount <= 0) {
            return "ERROR_AMOUNT_INVALID";
        }

        return "OK:" + UUID.randomUUID().toString();
    }
}
