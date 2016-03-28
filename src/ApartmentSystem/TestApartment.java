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
public class TestApartment {

    static Database db = new Database();

    public static void main(String[] args) {
        ArrayList<Object> Applicant = new ArrayList<Object>();
        Applicant = db.Person();
        //Print All
        for (Object Applicant1 : Applicant) {
            System.out.println( Applicant1);
        }
    }

}
