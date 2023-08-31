/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sLiNK
 */
public class Employee implements Serializable {
    
//to ensure the serialized format remains consistent when deserializing the data later
    
    private static final long serialVersionUID = 1L;
    
    private int employeeId;
    private String employeeName;
    private String employeeNid;
    private LocalDate employeeDob;
    private String employeeContact;
    private String employeeEmergencyContact;
    private String employeeAddress;
    private String employeeEmail;
    private LocalDate employeeDoj;
    private String employeeQualification;
    private String employeeArea;
    private String employeeCity;
    private double employeeSalary;
    private int employeeLeaveBalance;
    private String employeePosting;
    private String employeeDesignation;

    public Employee(int employeeId, String employeeName, String employeeNid, LocalDate employeeDob, String employeeContact, String employeeEmergencyContact, String employeeAddress, String employeeEmail, LocalDate employeeDoj, String employeeQualification, String employeeArea, String employeeCity, double employeeSalary, int employeeLeaveBalance, String employeePosting, String employeeDesignation) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeNid = employeeNid;
        this.employeeDob = employeeDob;
        this.employeeContact = employeeContact;
        this.employeeEmergencyContact = employeeEmergencyContact;
        this.employeeAddress = employeeAddress;
        this.employeeEmail = employeeEmail;
        this.employeeDoj = employeeDoj;
        this.employeeQualification = employeeQualification;
        this.employeeArea = employeeArea;
        this.employeeCity = employeeCity;
        this.employeeSalary = employeeSalary;
        this.employeeLeaveBalance = employeeLeaveBalance;
        this.employeePosting = employeePosting;
        this.employeeDesignation = employeeDesignation;
    }

      
    
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNid() {
        return employeeNid;
    }

    public void setEmployeeNid(String employeeNid) {
        this.employeeNid = employeeNid;
    }

    public LocalDate getEmployeeDob() {
        return employeeDob;
    }

    public void setEmployeeDob(LocalDate employeeDob) {
        this.employeeDob = employeeDob;
    }

    public String getEmployeeContact() {
        return employeeContact;
    }

    public void setEmployeeContact(String employeeContact) {
        this.employeeContact = employeeContact;
    }

    public String getEmployeeEmergencyContact() {
        return employeeEmergencyContact;
    }

    public void setEmployeeEmergencyContact(String employeeEmergencyContact) {
        this.employeeEmergencyContact = employeeEmergencyContact;
    }

    public String getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(String employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public LocalDate getEmployeeDoj() {
        return employeeDoj;
    }

    public void setEmployeeDoj(LocalDate employeeDoj) {
        this.employeeDoj = employeeDoj;
    }

    public String getEmployeeQualification() {
        return employeeQualification;
    }

    public void setEmployeeQualification(String employeeQualification) {
        this.employeeQualification = employeeQualification;
    }

    public String getEmployeeArea() {
        return employeeArea;
    }

    public void setEmployeeArea(String employeeArea) {
        this.employeeArea = employeeArea;
    }

    public String getEmployeeCity() {
        return employeeCity;
    }

    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeLeaveBalance() {
        return employeeLeaveBalance;
    }

    public void setEmployeeLeaveBalance(int employeeLeaveBalance) {
        this.employeeLeaveBalance = employeeLeaveBalance;
    }

    public String getEmployeePosting() {
        return employeePosting;
    }

    public void setEmployeePosting(String employeePosting) {
        this.employeePosting = employeePosting;
    }

    public String getEmployeeDesignation() {
        return employeeDesignation;
    }

    public void setEmployeeDesignation(String employeeDesignation) {
        this.employeeDesignation = employeeDesignation;
    }
    
} 

