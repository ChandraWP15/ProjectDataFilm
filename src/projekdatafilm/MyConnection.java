package projekdatafilm;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/uas_kbpl_db", "root", "");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
}