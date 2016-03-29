/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApartmentSystem;

/**
 *
 * @author Simmigon Flagg
 */
public class TestPerson {
    static Person p1 = new Person();
    public static void main(String[] args) {
        p1.setFirstName("Simmigon");
        p1.setLastName("Flagg");
        
        System.out.println("Test Person:\t"+p1.getFirstName()+" "+p1.getLastName());
    }
    
}
