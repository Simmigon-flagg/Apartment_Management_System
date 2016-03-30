/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApartmentSystem;

/**
 *
 * @author Riley
 */
public class Tenant {

    private String apartmentNumber;
    private String noOfBedrooms;
    private String clientID;

    public Tenant(String apartmentNumber, String noOfBedrooms, String clientID) {
        this.apartmentNumber = apartmentNumber;
        this.noOfBedrooms = noOfBedrooms;
        this.clientID = clientID;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public String getNoOfBedrooms() {
        return noOfBedrooms;
    }

    public void setNoOfBedrooms(String noOfBedrooms) {
        this.noOfBedrooms = noOfBedrooms;
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    @Override
    public String toString() {
        return "Tenant{" + "apartmentNumber=" + apartmentNumber + ", noOfBedrooms=" + noOfBedrooms + ", clientID=" + clientID + '}';
    }

}
