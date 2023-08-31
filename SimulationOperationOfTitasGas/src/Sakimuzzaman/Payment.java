/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sakimuzzaman;

/**
 *
 * @author Md.Sakimuzzaman
 */
public class Payment {
    private String paymentId;
    private String customerId;
    private double amount;
   // private LocalDateTime paymentDate;

    // Constructor
    public Payment(String paymentId, String customerId, double amount) {
        this.paymentId = paymentId;
        this.customerId = customerId;
        this.amount = amount;
        //this.paymentDate = LocalDateTime.now();
    }

    // Getters and setters
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getCustomerId() {
        return customerId;
    }

}