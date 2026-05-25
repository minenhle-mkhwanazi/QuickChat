
package com.mycompany.quickchatapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RegistrationTest {
    
    public RegistrationTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of registerUser method, of class Registration.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        Registration instance = new Registration();
        instance.registerUser();
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of userLogin method, of class Registration.
     */
    @Test
    public void testUserLogin() {
        System.out.println("userLogin");
        Registration instance = new Registration();
        instance.userLogin();
        
        fail("The test case is a prototype.");
    }
    
}
