
package connect_jdbc_mysql;

import com.mysql.cj.protocol.Resultset;
import static connect_jdbc_mysql.AccountConnection.getJDBConnection;
import java.awt.datatransfer.DataFlavor;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.w3c.dom.css.CSSPrimitiveValue;



public class Connect_JDBC_MySQL {
 
    public static void main(String[] args) throws SQLException {
        Connection conn  = getJDBConnection();
        //Thực hiện Statement cho câu lệnh tạo ra table Lop
        /* try {
        String mysql = "CREATE TABLE lop( " + "MaLop INT NOT NULL," + "TenLop VARCHAR(45) NULL," + "PRIMARY KEY (MaLop));";
        java.sql.Statement st = conn.createStatement();
        st.execute(mysql);
        System.out.print("Tao bang thanh cong");
        } catch (SQLException ex) {
        Logger.getLogger(Connect_JDBC_MySQL.class.getName()).log(Level.SEVERE, null, ex);
        System.out.print("Tao bang that bai");
        }*/
        // Thực hiện PreparedStatement thêm thông tin table Lop
        /* try {
        List<Lop> dsLop;
        dsLop = new ArrayList<Lop>();
        dsLop.add( new Lop(1,"CDTH 23R"));
        dsLop.add(new Lop(2,"CDTH 21E"));
        dsLop.add(new Lop(3,"CDTH 22A"));
        String sql = "INSERT INTO Lop(MaLop,TenLop) VALUES (?,?)";
        java.sql.PreparedStatement pr = conn.prepareStatement(sql);
        for (Lop l : dsLop){
        pr.setInt(1, l.getMaLop());
        pr.setString(2,l.getTenLop());
        pr.execute();
        }
        System.out.print("Them thong tin thanh cong");
        }
        catch (SQLException e) {
        System.out.print("Them thong tin that bai");
        } */
        //Thực hiện CallableStatement
       /* try {
            String sql2 = "CALL find_MaLop(?);";
            java.sql.CallableStatement ca = conn.prepareCall(sql2);
            ca.setInt(1, 2);
            ca.execute();
            ResultSet rs =  ca.getResultSet();
            while(rs.next()){
                
                System.out.println("MaLop: "  + rs.getInt(1)  + "\n" +"Ten Lop: "+ rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.print("That bai");
        }*/
       
      //Thực hiện Transaction giao dịch đúng
      /*java.sql.Statement st2 = conn.createStatement();
      conn.setAutoCommit(false);
        try {
            st2.execute("UPDATE sv SET sodu = 400000 WHERE MaSv = 1");
            st2.execute("UPDATE sv SET sodu = 800000 WHERE MaSv = 2");
            conn.commit();  
        } catch (SQLException e) {
            
            e.printStackTrace();
             conn.rollback();
     
        }
        conn.close(); */
      
       //Thực hiện Transaction giao dịch sai
      java.sql.Statement st2 = conn.createStatement();
  
        try {
            st2.execute("UPDATE sv SET sodu = 800000 WHERE MaSv = 1");
            st2.execute("UPDATE  SET sodu = 100000 WHERE MaSv = 2");
               conn.close(); 
        } catch (SQLException e) {           
            e.printStackTrace();
        }
        }
    }  


