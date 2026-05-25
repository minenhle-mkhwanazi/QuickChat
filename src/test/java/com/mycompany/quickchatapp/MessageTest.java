
package com.mycompany.quickchatapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MessageTest {
    
    public MessageTest() {
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
     * Test of checkMessageID method, of class Message.
     */
    @Test
    public void testCheckMessageID() {
        System.out.println("checkMessageID");
        String id = "";
        Message instance = null;
        boolean expResult = false;
        boolean result = instance.checkMessageID(id);
        assertEquals(expResult, result);
       
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkRecipientCell method, of class Message.
     */
    @Test
    public void testCheckRecipientCell_String() {
        System.out.println("checkRecipientCell");
        String cellNumber = "";
        Message instance = null;
        String expResult = "";
        String result = instance.checkRecipientCell(cellNumber);
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMessageHash method, of class Message.
     */
    @Test
    public void testCreateMessageHash_String_int() {
        System.out.println("createMessageHash");
        String message = "";
        int numMessages = 0;
        Message instance = null;
        String expResult = "";
        String result = instance.createMessageHash(message, numMessages);
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class Message.
     */
    @Test
    public void testSendMessage_String() {
        System.out.println("sendMessage");
        String message = "";
        Message instance = null;
        String expResult = "";
        String result = instance.sendMessage(message);
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of printMessage method, of class Message.
     */
    @Test
    public void testPrintMessage() {
        System.out.println("printMessage");
        Message instance = null;
        String expResult = "";
        String result = instance.printMessage();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalMessages method, of class Message.
     */
    @Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        Message instance = null;
        int expResult = 0;
        int result = instance.returnTotalMessages();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of storeMessage method, of class Message.
     */
    @Test
    public void testStoreMessage() {
        System.out.println("storeMessage");
        String message = "";
        Message instance = null;
        String expResult = "";
        String result = instance.storeMessage(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class Message.
     */
    @Test
    public void testSendMessage_0args() {
        System.out.println("sendMessage");
        Message instance = null;
        boolean expResult = false;
        boolean result = instance.sendMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createMessageHash method, of class Message.
     */
    @Test
    public void testCreateMessageHash_0args() {
        System.out.println("createMessageHash");
        Message instance = null;
        String expResult = "";
        String result = instance.createMessageHash();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkRecipientCell method, of class Message.
     */
    @Test
    public void testCheckRecipientCell_0args() {
        System.out.println("checkRecipientCell");
        Message instance = null;
        boolean expResult = false;
        boolean result = instance.checkRecipientCell();
        assertEquals(expResult, result);
        
        fail("The test case is a prototype.");
    }
    
}
