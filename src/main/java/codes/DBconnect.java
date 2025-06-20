package codes;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Saveen Maduranga
 */
public class DBconnect {
    public static Connection connect(){
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentms1","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return conn;
    }
}
