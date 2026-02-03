package com.Day4.NullPointerException.StudentManagement;

import java.util.Optional;

class Student {

    private int id;
    private String name;
    private String email;      // may be null
    private String phone;      // may be null
    private String address;    // may be null
    private String nickName;   // may be null

    public Student(int id, String name, String email, String phone, String address, String nickName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.nickName = nickName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // 1. Safely fetch email
    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    // 2. Return default phone if missing
    public Optional<String> getPhone() {
        return Optional.ofNullable(phone);
    }

    // 4. Fetch address safely
    public Optional<String> getAddress() {
        return Optional.ofNullable(address);
    }

    // 5. Nickname if present, else real name
    public Optional<String> getNickName() {
        return Optional.ofNullable(nickName);
    }
}
