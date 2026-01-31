package com.FunctionalInterfaces.StaticMethodsInterfaces.PasswordStrengthValidator;

public class InsurancePortal {

    public static void main(String[] args) {

        String password = "Ins@1234";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("✅ Strong password accepted");
        } else {
            System.out.println("❌ Weak password rejected");
        }
    }
}
