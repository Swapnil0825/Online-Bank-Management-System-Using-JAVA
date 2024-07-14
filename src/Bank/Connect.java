package Bank;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

    public static void connect() 
    {
        Connection conn = null;
        try {
            String url = " ";
            String user=" ";
            String pass=" ";
            
            conn = DriverManager.getConnection(url,user,pass);

           
            
            String q="insert into sp values(2,'Swapnil');";       
            Statement st=conn.createStatement();
            st.executeUpdate(q);
            System.out.println("Connection to SQLite has been established.");
            
            
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        connect();
    }
}
