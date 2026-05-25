package com.mycompany.quickchatapp;
import java.util.Scanner;
public class Login {
   
    
    Scanner input = new Scanner(System.in);
    
    // Class Registration
class Registration {
    private String storedUsername;
    private String storedPassword;
    private String storedPhonenumber;

    private Scanner input = new Scanner(System.in);

    // Username Validation
    private boolean checkUsername(String username) {
        if (username.length() >= 5) {
            return true;
        } else {
            System.out.println("Username must be at least 5 characters and contain an underscore.");
            return false;
        }
    }

    // Password Validation
    private boolean checkPassword(String password) {
        if (password.length() >= 8 &&
            password.matches(".*[A-Z].*") &&
            password.matches(".*\\d.*")) {
            return true;
        } else {
            System.out.println("Password must be at least 8 characters, contain a capital letter and a number.");
            return false;
        }
    }

    // Phone Number Validation
    private boolean checkPhonenumber(String phonenumber) {
        if (phonenumber.matches("^0\\d{9}$")) {
            return true;
        } else {
            System.out.println("Use South African format starting with 0 and 10 digits.");
            return false;
        }
    }

    // User Registration
    public void registerUser() {
        System.out.println("\n===== CREATE ACCOUNT =====");

        System.out.print("Enter Username: ");
        String username = input.nextLine();

        System.out.print("Enter Password: ");
        String password = input.nextLine();

        System.out.print("Enter South African Cellphone Number: ");
        String phonenumber = input.nextLine();

        if (checkUsername(username) && checkPassword(password) && checkPhonenumber(phonenumber)) {
            storedUsername = username;
            storedPassword = password;
            storedPhonenumber = phonenumber;

            System.out.println("Account created successfully!");
        } else {
            System.out.println("Registration failed. Try again.");
        }
    }

    // User Login
    public void userLogin() {
        if (storedUsername == null) {
            System.out.println("No user registered yet.");
            return;
        }

        int attempts = 3;
        boolean success = false;

        System.out.println("\n===== LOGIN =====");

        while (attempts > 0 && !success) {
            System.out.print("Enter Username: ");
            String username = input.nextLine();

            System.out.print("Enter Password: ");
            String password = input.nextLine();

            System.out.print("Enter Cellphone Number: ");
            String phonenumber = input.nextLine();

            if (username.equals(storedUsername) &&
                password.equals(storedPassword) &&
                phonenumber.equals(storedPhonenumber)) {

                System.out.println("Login successful. Welcome back!");
                success = true;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Incorrect details. Attempts left: " + attempts);
                }
            }
        }

        if (!success) {
            System.out.println("Too many failed attempts. Account is locked.");
        }
    }
}
    }

