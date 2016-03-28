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
import java.awt.CardLayout;
import java.awt.Panel;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.smartcardio.Card;
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

    public Object[] LoginModel(String name, String password) {
        sql = "SELECT userName, password FROM apartrmentrentaldb.applicanttable;";

        Object[] namedb = null;

        try {

            dbStatement = DatabaseConn().createStatement();

            rs = dbStatement.executeQuery(sql);

            while (rs.next()) {

                namedb[0] = rs.getString("idapartmentPrice").concat("\n");
                namedb[1] = rs.getString("onebedroom").concat("\n");
                namedb[2] = rs.getString("twobedroom").concat("\n");
                namedb[3] = rs.getString("threebedroom").concat("\n");

                namedb[4] = rs.getString("apartmentName").concat("\n");
                namedb[5] = rs.getString("onebedroom").concat("\n");
            }

            conn.close();
            System.out.println("From DB: " + namedb);

        } catch (Exception e) {

            System.out.println("LoginModel: " + e);
        }

        return namedb;
    }//End of Login

    public ArrayList<Object> Person() {
        sql = "SELECT * FROM applicanttable;";
        ArrayList<Object> person = new ArrayList<Object>();
        try {

            dbStatement = DatabaseConn().createStatement();

            rs = dbStatement.executeQuery(sql);

            while (rs.next()) {

                Object idApplicant = rs.getInt("idApplicant");
                Object firstName = rs.getString("firstName");
                Object lastName = rs.getString("lastName");
                Object userName = rs.getString("userName");
                Object dateOfBirth = rs.getString("dateOfBirth");
                Object password = rs.getString("password");
                Object socialSecurity = rs.getString("socialSecurity");

//                System.out.println(idApplicant + "\t" + firstName
//                        + "\t" + lastName + "\t" + userName
//                        + "\t" + dateOfBirth
//                        + "\t" + password
//                        + "\t" + socialSecurity);
                
                person.add(idApplicant);
                person.add(firstName);
                person.add(lastName);
                person.add(userName);
                person.add(dateOfBirth);
                person.add(password);
                person.add(socialSecurity);
                
                
            }

            conn.close();
            //  System.out.println("From DB: " + Arrays.toString(namedb));

        } catch (Exception e) {
            System.out.println("Person: " + e);
            return null;
        }
        return person;

    }//End of Login

}
