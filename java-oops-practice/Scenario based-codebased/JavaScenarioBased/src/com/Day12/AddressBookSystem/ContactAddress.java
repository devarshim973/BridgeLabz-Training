package com.Day12.AddressBookSystem;

public class ContactAddress {

    private String city;
    private String state;
    private String zipCode;

    public ContactAddress(String city, String state, String zipCode) {
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return city + ", " + state + " - " + zipCode;
    }
}
