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

public class Database {

    Statement dbStatement = null;
    static Connection conn = null;
    String sql = null;
    ResultSet rs = null;

    public static Connection DatabaseConn() {
        try {
            /**
             * $servername = "us-cdbr-azure-east-a.cloudapp.net"; $username =
             * "b397f6ac809d08"; $password = "4131b78e89f4fa9"; $dbname =
             * "ApartrmentRentalDB";
             */
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

    public boolean Login(String name, String password) {
        boolean login = false;
        if ((name.equals("admin") && password.equals("admin"))) {
            login = true;
        }
        return login;
    }

    public ArrayList<Object> getTenant() {
        ArrayList<Object> tenant = new ArrayList<>();

        sql = "SELECT * FROM applicant INNER JOIN "
                + "          user ON applicant.idApplicant = user.idApplicant;";

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
            }
            conn.close();

        } catch (Exception e) {

            System.out.println("getTenant: " + e);
        }

        return tenant;

    }//end of getTenant
}
