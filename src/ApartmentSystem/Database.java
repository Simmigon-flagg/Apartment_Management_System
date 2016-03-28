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
import java.sql.*;
import java.util.ArrayList;
//MVC Model 

public class Database {

    Statement dbStatement = null;
    static Connection conn = null;
    String sql = null;
    ResultSet rs = null;

    public static Connection DatabaseConn() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://"
                    + "us-cdbr-azure-east-a.cloudapp.net/"
                    + "ApartrmentRentalDB",
                    "b397f6ac809d08",
                    "4131b78e89f4fa9");
            System.out.println("Connected");
            return conn;
        } catch (Exception e) {
            System.out.println("Not Connected");

            return null;
        }
    }//end of database connection

    public ArrayList<Object> getTenant(String apartment) {
        ArrayList<Object> tenant = new ArrayList<>();

        sql = "SELECT * FROM applicanttable INNER JOIN usertable ON applicanttable.idApplicant = usertable.idApplicant\n"
                + "							 INNER JOIN " + apartment + " ON usertable.iduser = " + apartment + ".iduser;";
        //SELECT onebedroom FROM pricelegacytable
        try {

            dbStatement = DatabaseConn().createStatement();

            rs = dbStatement.executeQuery(sql);

            while (rs.next()) {
                tenant.add(rs.getString("firstName").concat("\n"));
                tenant.add(rs.getString("lastName").concat("\n"));
                tenant.add(rs.getString("userName").concat("\n"));
                tenant.add(rs.getString("dateOfBirth").concat("\n"));
                tenant.add(rs.getString("password").concat("\n"));
                tenant.add(rs.getString("socialSecurity").concat("\n"));
                tenant.add(rs.getString("address").concat("\n"));
                tenant.add(rs.getString("emailAddress").concat("\n"));
                tenant.add(rs.getString("phoneNumber").concat("\n"));
                tenant.add(rs.getString("employedBy").concat("\n"));
                tenant.add(rs.getString("monthlyGrossPay").concat("\n"));
                tenant.add(rs.getString("criminalBackgroundCheck").concat("\n"));
                tenant.add(rs.getString("apartmentName").concat("\n"));
                tenant.add(rs.getString("numberOfRooms").concat("\n"));
                tenant.add(rs.getString("aptNumber").concat("\n"));
            }
            conn.close();

        } catch (Exception e) {

            System.out.println("getTenant: " + e);
        }

        return tenant;

    }//end of getTenant

    public boolean LoginModel(String name,String password) {
        sql = "SELECT userName, password FROM apartrmentrentaldb.applicanttable;";
        String vName = name;
        String vPassword = password;
         System.out.println("From String: "+vName.charAt(0)+ "From String: "+ vPassword);
        boolean isLoggedIn = false; 
        try {

            dbStatement = DatabaseConn().createStatement();

            rs = dbStatement.executeQuery(sql);
            String namedb = "";

            String passworddb = "";
            while (rs.next()) {

                 namedb = rs.getString("userName").concat("\n");

                 passworddb = rs.getString("password").concat("\n");
            }
            
            
            conn.close();
            System.out.println("From DB: "+namedb + "From DB" + passworddb);
             System.out.println("From String: "+name+ "From String: "+ password);
            if (vName.equals(namedb) && vPassword.equals(passworddb)) {
                isLoggedIn = true;
            }

        } catch (Exception e) {

            System.out.println("LoginModel: " + e);
        }

        return isLoggedIn;
    }//End of Login

}
