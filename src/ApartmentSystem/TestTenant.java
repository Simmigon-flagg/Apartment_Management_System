/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApartmentSystem;

import static ApartmentSystem.TestDatabase.db;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Riley
 */
public class TestTenant {

    public static void main(String[] args) {

        Database tenantDatabase = new Database();
       
        
        ArrayList tenant =  tenantDatabase.getTenant();
        

        for (Object tenant1 : tenant) {
            System.out.println("From DB Tenant is : " + tenant1);
        }

    }

}
