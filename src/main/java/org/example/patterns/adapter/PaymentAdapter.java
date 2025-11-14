package org.example.patterns.adapter;

public class PaymentAdapter implements PaymentService {

    private final LegacyPaymentProcessor legacyPaymentProcessor;

    public PaymentAdapter(LegacyPaymentProcessor processor) {
        this.legacyPaymentProcessor = processor;
    }

    @Override
    public PaymentResult pay(double amount, String cardToken) {
        String response = legacyPaymentProcessor.process(amount, cardToken, "EUR");

        if (response.startsWith("OK:")) {
            return new PaymentResult(true, "SUCCESS", response.substring(3));
        }

        return new PaymentResult(false, response, null);
    }
}
