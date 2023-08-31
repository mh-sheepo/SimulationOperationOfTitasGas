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
public class Customer {
    private String customerId;
    private String name;
    private String address;
    private String email;
    private String phone;
    private double gasConsumed;
    private double billAmount;
    private boolean hasPendingBill;

    // Constructor
    public Customer(String customerId, String name, String address, String email, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.gasConsumed = 0.0;
        this.billAmount = 0.0;
        this.hasPendingBill = false;
    }

    // Getters and setters
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getGasConsumed() {
        return gasConsumed;
    }

    public void setGasConsumed(double gasConsumed) {
        this.gasConsumed = gasConsumed;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public boolean hasPendingBill() {
        return hasPendingBill;
    }

    public void setHasPendingBill(boolean hasPendingBill) {
        this.hasPendingBill = hasPendingBill;
    }
}









