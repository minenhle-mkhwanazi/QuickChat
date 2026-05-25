package com.mycompany.quickchatapp;

import java.util.Scanner;

public class QuickChatApp {

    public static void main(String[] args) {
        
        Scanner menuInput = new Scanner(System.in);
        Registration app = new Registration(); 
        int choice;

        // Menu loop
        do {
            System.out.println("\n===== REGISTRATION APP MENU =====");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");

            choice = menuInput.nextInt();
            menuInput.nextLine();

            switch (choice) {
                case 1:
                    app.registerUser();
                    break; 
                case 2:
                    app.userLogin();   
                    break;
                case 3:
                    System.out.println("Goodbye"); 
                    break;
                default:
                    System.out.println("Invalid option. Try again."); 
            }
        } while (choice != 3);

        menuInput.close();
    }
}

// Class Registration
class Registration {
    private String storedUsername;
    private String storedPassword;
    private String storedPhonenumber;

    private Scanner input = new Scanner(System.in);

    // Username Validation
    private boolean checkUsername(String username) {
        if (username.length() >= 5 && username.contains("_")) {
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

    
    public void userLogin() {
        if (storedUsername == null || storedPassword == null) {
            System.out.println("No account found. Please register first.");
            return;
        }

        System.out.println("\n===== LOGIN =====");
        System.out.print("Enter Username: ");
        String username = input.nextLine();

        System.out.print("Enter Password: ");
        String password = input.nextLine();

        if (username.equals(storedUsername) && password.equals(storedPassword)) {
            System.out.println("Login successful! Welcome " + storedUsername);
        } else {
            System.out.println("Login failed. Incorrect username or password.");
        }
    }
}


