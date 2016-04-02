/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApartmentSystem;

import static ApartmentSystem.TestDatabase.db;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author Riley
 */
public class TestTenant {

    public static void main(String[] args) {

        Database tenantDatabase = new Database();

        ArrayList tenant = tenantDatabase.getTenant();

        Object[] myTenant = new Object[tenant.size()];

        for (int i = 0; i < tenant.size(); i++) {
            myTenant[i] = tenant.get(i);

        }
       
        int count = 0;
        for (Object myTenant1 : myTenant) {
            count++;
            System.out.print(myTenant1 + " ");
            if (count == 7) {
                System.out.println("");
                count = 0;
            }
        }

    }

}
