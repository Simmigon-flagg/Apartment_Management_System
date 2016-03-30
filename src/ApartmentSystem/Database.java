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

    public ArrayList<Object> getAllUser() {
        sql = "SELECT * FROM user;";
        ArrayList<Object> person = new ArrayList<>();
        try {

            dbStatement = DatabaseConn().createStatement();

            rs = dbStatement.executeQuery(sql);

            while (rs.next()) {
                person.add(rs.getInt("iduser"));
                person.add(rs.getString("firstName"));
                person.add(rs.getString("lastName"));
                person.add(rs.getString("userName"));
                person.add(rs.getString("dateOfBirth"));
                person.add(rs.getString("pass"));
            }

            conn.close();

        } catch (Exception e) {
            System.out.println("getAllUser: " + e);
            return null;
        }
        return person;

    }//End of getAllUser

    public ArrayList<Object> getAllLocationAndPrice() {
        sql = "SELECT * FROM apartmentlocation;";
        ArrayList<Object> apartment = new ArrayList<>();
        try {

            dbStatement = DatabaseConn().createStatement();

            rs = dbStatement.executeQuery(sql);

            while (rs.next()) {

                apartment.add(rs.getInt("idapartmentlocation"));
                apartment.add(rs.getInt("iduser"));
                apartment.add(rs.getString("location"));
                apartment.add(rs.getString("aptNumber"));
                apartment.add(rs.getString("numberOfBedrooms"));
                apartment.add(rs.getString("price"));
            }

            conn.close();

        } catch (Exception e) {
            System.out.println("getAllLocationAndPrice: " + e);
            return null;
        }
        return apartment;

    }//End of getAllLocationAndPrice

    public ArrayList<Object> getAllApplicant() {
        ArrayList<Object> applicant = new ArrayList<>();

        sql = "SELECT * FROM applicant;";
        try {

            dbStatement = DatabaseConn().createStatement();

            rs = dbStatement.executeQuery(sql);

            while (rs.next()) {
                applicant.add(rs.getInt("idapplicant"));
                applicant.add(rs.getInt("iduser"));
                applicant.add(rs.getInt("accepted"));
                applicant.add(rs.getString("socialSecurity"));
                applicant.add(rs.getString("streetAddress"));
                applicant.add(rs.getString("City"));
                applicant.add(rs.getString("Zip"));
                applicant.add(rs.getString("phoneNumber"));
                applicant.add(rs.getString("employedBy"));
                applicant.add(rs.getString("JobTitle"));
                applicant.add(rs.getString("monthlyGrossPay"));
                applicant.add(rs.getString("criminalBackgroundCheck"));

            }
            conn.close();

        } catch (Exception e) {

            System.out.println("getAllApplicant: " + e);
        }

        return applicant;

    }//end of getAllApplicant

    public ArrayList<Object> getAlllApplication() {
        ArrayList<Object> getAlllApplication = new ArrayList<>();

        sql = "SELECT "
                + "firstName,"
                + "lastName,"
                + "userName,"
                + "dateOfBirth,"
                + "pass,"
                + "accepted,"
                + "socialSecurity,"
                + "streetAddress,"
                + "City,"
                + "Zip,"
                + "phoneNumber,"
                + "employedBy,"
                + "JobTitle,\n"
                + "monthlyGrossPay,"
                + "criminalBackgroundCheck,"
                + "location,"
                + "aptNumber,"
                + "numberOfBedrooms,"
                + "price\n"
                + "FROM user\n"
                + "INNER JOIN applicant\n"
                + "ON user.iduser=applicant.iduser\n"
                + "INNER JOIN apartmentlocation\n"
                + "ON applicant.iduser=apartmentlocation.iduser;";

        try {

            dbStatement = DatabaseConn().createStatement();

            rs = dbStatement.executeQuery(sql);

            while (rs.next()) {

                getAlllApplication.add(rs.getString("firstName"));
                getAlllApplication.add(rs.getString("lastName"));
                getAlllApplication.add(rs.getString("userName"));
                getAlllApplication.add(rs.getString("dateOfBirth"));
                getAlllApplication.add(rs.getString("pass"));
                getAlllApplication.add(rs.getString("accepted"));
                getAlllApplication.add(rs.getString("socialSecurity"));
                getAlllApplication.add(rs.getString("streetAddress"));
                getAlllApplication.add(rs.getString("City"));
                getAlllApplication.add(rs.getString("Zip"));
                getAlllApplication.add(rs.getString("phoneNumber"));
                getAlllApplication.add(rs.getString("employedBy"));
                getAlllApplication.add(rs.getString("JobTitle"));
                getAlllApplication.add(rs.getString("monthlyGrossPay"));
                getAlllApplication.add(rs.getString("location"));
                getAlllApplication.add(rs.getString("aptNumber"));
                getAlllApplication.add(rs.getString("price"));

            }

            conn.close();

        } catch (Exception e) {

            System.out.println("getAlllApplication: " + e);
        }

        return getAlllApplication;
    }//End of getAlllApplication

    public Object[] isLogin(String email, String password) {
        boolean isLogin = false;
        Object[] user = new Object[2];
        user[0] = isLogin;
        sql = "SELECT userName,pass,firstName FROM user"
                + " WHERE userName = \'" + email + "\'"
                + " AND pass = \'" + password + "\';";

        try {

            dbStatement = DatabaseConn().createStatement();

            rs = dbStatement.executeQuery(sql);
            String theemail = null;
            String passwordDB = null;
            String name = null;
            while (rs.next()) {

                theemail = rs.getString("userName");
                passwordDB = rs.getString("pass");
                name = rs.getString("firstName");

            }
            if (email.equals(theemail) && theemail != null
                    && password.equals(passwordDB) && passwordDB != null) {

         
                user[0] = true;
                user[1] = name;

            }

            conn.close();

        } catch (Exception e) {

            System.out.println("isLogin: " + e);
        }

        return user;
    }//End of isLogin
    
    //Update
    //Create
    //Delele
}
