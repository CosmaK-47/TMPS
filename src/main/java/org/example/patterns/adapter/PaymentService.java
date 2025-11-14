package org.example.patterns.adapter;

public interface PaymentService {
    PaymentResult pay(double amount, String cardToken);
}
