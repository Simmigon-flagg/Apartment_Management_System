package ApartmentSystem;

/**
 *
 * @author shittul
 */
public class Admin {

    String Admin;
public Admin(String Admin) {
        this.Admin = Admin;
    }
    public Admin() {
        this.Admin = "Admin";
    }
    public String getAdmin() {
        return Admin;
    }

    public void setAdmin(String Admin) {
        this.Admin = Admin;
    }

    @Override
    public String toString() {
        return "Admin{" + "Admin=" + Admin + '}';
    }

    

}
