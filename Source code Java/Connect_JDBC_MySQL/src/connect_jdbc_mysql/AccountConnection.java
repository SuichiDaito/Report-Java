
package connect_jdbc_mysql;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AccountConnection {
       public static Connection getJDBConnection(){   
           String url ="jdbc:mysql://localhost:3306/ql_sinhvien";
           String user = "root";
           String password = "1234";
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
               try {
                   return DriverManager.getConnection(url, user, password);
               } catch (SQLException ex) {
                   Logger.getLogger(AccountConnection.class.getName()).log(Level.SEVERE, null, ex);
               }
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AccountConnection.class.getName()).log(Level.SEVERE, null, ex);
                }
                     return null;
                    } 
                        }

          

