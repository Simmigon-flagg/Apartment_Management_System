/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApartmentSystem;

import java.util.ArrayList;

/**
 *
 * @author Simmigon Flagg
 */
public class TestDatabase {
    static Database db = new Database();
    
    public static void main(String[] args) {
        ArrayList<Object> Applicant = new ArrayList<>();
//        Applicant = db.PersonDB();
//        //Print All
//        for (Object Applicant1 : Applicant) {
//            System.out.println("Person Data: " + Applicant1);
//        }
        
      //  Applicant = db.allLocationAndPrice();
        for (Object Applicant1 : Applicant) {
            //System.out.println("Location Data: "+Applicant1);
        }//price and location
        
        //Pre: username and password
    //    Object[] login = new Object[2];
      //  login = db.isLogin("admin@admin.com", "admin");
    //    if ((boolean)login[0] == true) {
        //    System.out.println("You are logged in as: " + login[1]);
            
    //    }//Post: username returned 
        
       // Applicant = db.getAllApplicant();
        for (Object Applicant1 : Applicant) {
         //   System.out.println("Applicate Data: "+Applicant1);
        }//price and location 
        
      //    Applicant = db.allUser();
        for (Object Applicant1 : Applicant) {
           // System.out.println("Applicate Data: "+Applicant1);
        }//User
        
        //findApplication
        Applicant = db.getAllApplication();
          for (Object Applicant1 : Applicant) {
           System.out.println("Application Data: "+Applicant1);
        }//Applicant
          
          for (Object TENANT : db.getTenant()) {
              System.out.println("From Tenant class: " + TENANT);
            
        }

        
    }

}
