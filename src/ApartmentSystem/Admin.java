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
public class Admin {

    private int admin_id;
    private User adminUser = new User("Admin", "admin", "admin", "0");

    public Admin() {
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public void setAdminUser(User adminUser) {
        this.adminUser = adminUser;
    }

    public int getAdmin_id() {
        return admin_id;
    }

    public User getAdminUser() {
        return adminUser;
    }

    public boolean isAdmin(int password) {
        boolean isAdmin = false;
        if (password == getAdmin_id()) {
            isAdmin = true;
        }

        return isAdmin;
    }

}
