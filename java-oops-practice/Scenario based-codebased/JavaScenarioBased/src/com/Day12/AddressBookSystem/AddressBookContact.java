package com.Day12.AddressBookSystem;

public class AddressBookContact {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private ContactAddress address;

    public AddressBookContact(String firstName, String lastName,
                              String phoneNumber, String email,
                              ContactAddress address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public ContactAddress getAddress() {
        return address;
    }

    public void updateContact(String phoneNumber, String email) {
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @Override
    public String toString() {
        return getFullName() +
                " | Phone: " + phoneNumber +
                " | Email: " + email +
                " | Address: " + address;
    }
}
