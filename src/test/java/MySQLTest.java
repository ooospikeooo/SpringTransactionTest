import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class MySQLTest {
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/transaction_test?serverTimezone=Asia/Seoul&&useSSL=false";
    private static final String USER = "tester";
    private static final String PW = "1234";

    static {
        try {
            Class.forName(DRIVER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//static

    @Test
    public void testConnection(){
        Connection con = null;
        try{
            con = DriverManager.getConnection(URL, USER, PW);
        }catch(SQLException e) {

            e.printStackTrace();
        }
    }//testConnection_

    @Test
    public void insert_test(){
        Connection con = null;
        try{
            con = DriverManager.getConnection(URL, USER, PW);
        }catch(SQLException e) {

            e.printStackTrace();
        }
    }
}
