/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package srgiapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author afzal
 */
public class DBConnection {
    static Connection con=null;
    public static Connection dbconnect()
    {
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/srgidb","root","root");
    //JOptionPane.showMessageDialog(null,"Successful");
    return con;
    
    }
    catch(ClassNotFoundException | SQLException e){}
    return con;
    }

    private static class JOptionPane {

        private static void showMessageDialog(Object object, String successful) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public JOptionPane() {
        }
    }
    
}
