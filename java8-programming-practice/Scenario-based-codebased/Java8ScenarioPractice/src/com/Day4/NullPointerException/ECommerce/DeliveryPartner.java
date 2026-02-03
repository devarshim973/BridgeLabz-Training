package com.Day4.NullPointerException.ECommerce;

class DeliveryPartner {

    private String partnerName;
    private String contactNumber;

    public DeliveryPartner(String partnerName, String contactNumber) {
        this.partnerName = partnerName;
        this.contactNumber = contactNumber;
    }

    public String getPartnerName() {
        return partnerName;
    }
}
