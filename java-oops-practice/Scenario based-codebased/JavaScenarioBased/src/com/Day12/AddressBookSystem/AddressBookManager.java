package com.Day12.AddressBookSystem;

import java.util.*;

public class AddressBookManager {

    private List<AddressBookContact> contacts = new ArrayList<>();

    // Add contact with duplicate validation
    public void addContact(AddressBookContact contact) {
        for (AddressBookContact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(contact.getFullName())) {
                System.out.println("Duplicate contact not allowed: " + contact.getFullName());
                return;
            }
        }
        contacts.add(contact);
        System.out.println("Contact added: " + contact.getFullName());
    }

    // Edit contact by name
    public void editContact(String fullName, String phone, String email) {
        for (AddressBookContact c : contacts) {
            if (c.getFullName().equalsIgnoreCase(fullName)) {
                c.updateContact(phone, email);
                System.out.println("Contact updated: " + fullName);
                return;
            }
        }
        System.out.println("Contact not found: " + fullName);
    }

    // Delete contact by name
    public void deleteContact(String fullName) {
        Iterator<AddressBookContact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getFullName().equalsIgnoreCase(fullName)) {
                iterator.remove();
                System.out.println("Contact deleted: " + fullName);
                return;
            }
        }
        System.out.println("Contact not found: " + fullName);
    }

    // Search by city or state
    public void searchByLocation(String location) {
        System.out.println("Contacts in " + location + ":");
        for (AddressBookContact c : contacts) {
            if (c.getAddress().getCity().equalsIgnoreCase(location) ||
                c.getAddress().getState().equalsIgnoreCase(location)) {
                System.out.println(c);
            }
        }
    }

    // Display all contacts sorted alphabetically
    public void displayAllContacts() {
        contacts.sort(Comparator.comparing(AddressBookContact::getFullName));
        System.out.println("----- All Contacts -----");
        for (AddressBookContact c : contacts) {
            System.out.println(c);
        }
    }
}
