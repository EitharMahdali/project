/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project251;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amnah
 */
public class UserTest {
    
    public UserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of AddUser method, of class User.
     */
    @Test
    public void testAddUser() {
        System.out.println("AddUser");
        String SSN = "1234567899";
        String password = "asdfghjk";
        User instance = new User(SSN,password);
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getSSN method, of class User.
     */
    @Test
    public void testGetSSN() {
        System.out.println("getSSN");
        User instance = new User( "1234567899","asdfghjk");
        String expResult =  "1234567899";
        String result = instance.getSSN();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User( "1234567899","asdfghjk");
        String expResult = "asdfghjk";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of Login method, of class User.
     */
    @Test
    public void testLogin() {
        System.out.println("Login");
        String SSN = "1234567899";
        String password = "asdfghjk";
        User instance = new User(SSN,password);
        boolean expResult = false;
        boolean result = instance.Login(SSN, password);
        assertEquals(expResult, result);
        
    }
    
}
