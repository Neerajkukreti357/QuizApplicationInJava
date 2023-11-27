/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author NeerajKukreti
 */
public class ConnectionProviderClass {
    
    //method for setting connnction between java and mysql
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizmanagementexamsystem","root","Nikhil@20031");
            return con;
        } catch(Exception e){
            return null;
        }
    }
}
