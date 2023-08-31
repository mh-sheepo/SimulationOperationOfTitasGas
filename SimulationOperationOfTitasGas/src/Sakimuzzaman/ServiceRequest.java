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
public class ServiceRequest {
    private String requestId;
    private String customerId;
    private String description;
    private boolean isResolved;

    // Constructor
    public ServiceRequest(String requestId, String customerId, String description) {
        this.requestId = requestId;
        this.customerId = customerId;
        this.description = description;
        this.isResolved = false;
    }

    // Getters and setters
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isResolved() {
        return isResolved;
    }

    public void setResolved(boolean resolved) {
        isResolved = resolved;
    }
}
