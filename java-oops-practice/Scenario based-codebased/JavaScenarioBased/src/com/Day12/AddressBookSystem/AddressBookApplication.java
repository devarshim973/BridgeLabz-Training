package com.Day12.AddressBookSystem;

public class AddressBookApplication {

    public static void main(String[] args) {

        AddressBookManager manager = new AddressBookManager();

        AddressBookContact c1 = new AddressBookContact(
                "Alice", "Brown", "9876543210",
                "alice@gmail.com",
                new ContactAddress("Delhi", "Delhi", "110001")
        );

        AddressBookContact c2 = new AddressBookContact(
                "Bob", "Smith", "9123456780",
                "bob@gmail.com",
                new ContactAddress("Mumbai", "Maharashtra", "400001")
        );

        manager.addContact(c1);
        manager.addContact(c2);

        manager.displayAllContacts();

        manager.editContact("Alice Brown", "9999999999", "alice_new@gmail.com");

        manager.searchByLocation("Delhi");

        manager.deleteContact("Bob Smith");

        manager.displayAllContacts();
    }
}
