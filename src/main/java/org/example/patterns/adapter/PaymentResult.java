package org.example.patterns.adapter;

public record PaymentResult(boolean success, String status, String transactionId)
{

}
