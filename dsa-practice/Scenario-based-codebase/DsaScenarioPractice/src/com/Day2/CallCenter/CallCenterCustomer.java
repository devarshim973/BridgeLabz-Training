package com.Day2.CallCenter;

class CallCenterCustomer {

    private String customerId;
    private boolean isVip;

    public CallCenterCustomer(String customerId, boolean isVip) {
        this.customerId = customerId;
        this.isVip = isVip;
    }

    public String getCustomerId() {
        return customerId;
    }

    public boolean isVip() {
        return isVip;
    }
}
