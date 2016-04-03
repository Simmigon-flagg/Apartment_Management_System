/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApartmentSystem;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Simmigon Flagg
 */
public class AdminTest {
    
    public AdminTest() {
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
     * Test of setAdmin_id method, of class Admin.
     */
    @Test
    public void testSetAdmin_id() {
        System.out.println("setAdmin_id");
        int admin_id = 0;
        Admin instance = new Admin();
        instance.setAdmin_id(admin_id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdminUser method, of class Admin.
     */
    @Test
    public void testSetAdminUser() {
        System.out.println("setAdminUser");
        User adminUser = null;
        Admin instance = new Admin();
        instance.setAdminUser(adminUser);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdmin_id method, of class Admin.
     */
    @Test
    public void testGetAdmin_id() {
        System.out.println("getAdmin_id");
        Admin instance = new Admin();
        int expResult = 0;
        int result = instance.getAdmin_id();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAdminUser method, of class Admin.
     */
    @Test
    public void testGetAdminUser() {
        System.out.println("getAdminUser");
        Admin instance = new Admin();
        User expResult = null;
        User result = instance.getAdminUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAdmin method, of class Admin.
     */
    @Test
    public void testIsAdmin() {
        System.out.println("isAdmin");
        int password = 0;
        Admin instance = new Admin();
        boolean expResult = false;
        boolean result = instance.isAdmin(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
