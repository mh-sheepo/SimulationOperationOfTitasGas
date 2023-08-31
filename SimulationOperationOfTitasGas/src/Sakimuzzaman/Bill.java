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

public class Bill {
    private String billId;
    private String customerId;
    private double gasConsumed;
    private double amount;
    //private LocalDateTime billingDate;
    private boolean isPaid;

    // Constructor
    public Bill(String billId, String customerId, double gasConsumed, double amount) {
        this.billId = billId;
        this.customerId = customerId;
        this.gasConsumed = gasConsumed;
        this.amount = amount;
        //this.billingDate = LocalDateTime.now();
        this.isPaid = false;
    }

    // Getters and setters
    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public double getGasConsumed() {
        return gasConsumed;
    }

    public void setGasConsumed(double gasConsumed) {
        this.gasConsumed = gasConsumed;
    }

    public double getAmount() {
        return amount;
    }
    
}