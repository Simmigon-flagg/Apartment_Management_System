/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ApartmentSystem;

/**
 *
 * @author Riley SELECT FROM user INNER JOIN applicant ON
 * user.iduser=applicant.iduser INNER JOIN apartmentlocation ON
 * applicant.iduser=apartmentlocation.iduser;
 */
public class Tenant {

    private String clientID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String location;
    private String aptNumber;
    private String numberOfBedrooms;
    private String price;

    public Tenant(String clientID, String firstName, String lastName, String phoneNumber, String location, String aptNumber, String numberOfBedrooms, String price) {
        this.clientID = clientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.aptNumber = aptNumber;
        this.numberOfBedrooms = numberOfBedrooms;
        this.price = price;
    }

    public Tenant() {
        this.clientID = "ClientId";
        this.firstName = "FirstName";
        this.lastName = "lastNAme";
        this.phoneNumber = "phoneNumber";
        this.location = "location";
        this.aptNumber = "aptNumber";
        this.numberOfBedrooms = "numberOfBedroom";
        this.price = "price";
    }

    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAptNumber() {
        return aptNumber;
    }

    public void setAptNumber(String aptNumber) {
        this.aptNumber = aptNumber;
    }

    public String getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(String numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void size() {
        
    }

    @Override
    public String toString() {
        return  clientID + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", location=" + location + ", aptNumber=" + aptNumber + ", numberOfBedrooms=" + numberOfBedrooms + ", price=" + price + '}';
    }

}
